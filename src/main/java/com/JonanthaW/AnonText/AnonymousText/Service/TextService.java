package com.JonanthaW.AnonText.AnonymousText.Service;


import com.JonanthaW.AnonText.AnonymousText.Repo.TextRepository;
import com.JonanthaW.AnonText.AnonymousText.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TextService {
    @Autowired
    private TextRepository textRepository;

    // create new anonText

    public Text createText(Text text) {
        return textRepository.save(text);
    }

    // get all texts;
    public List<Text> getAllText() {
        return textRepository.findAll();
    }

    public Optional<Text> getTextByUrlCode(String urlCode) {
        return textRepository.findByUrlCode(urlCode);
    }

    // get text by URL
    public Optional<Text> getTextById(Long id) {
        return textRepository.findById(id);
    }

    // get last 10 added texts
    public List<Text> findFirst10ByOrderByIdDesc() {
        PageRequest pageable = PageRequest.of(0, 10);
        return textRepository.findFirst10ByOrderByIdDesc(pageable);
    }

    // update Text by Id

    public Text updateText(Long id, Text textDetails) {
        Optional<Text> text = textRepository.findById(id);
        if (text.isPresent()) {
            Text existText = text.get();
            existText.setContent(textDetails.getContent());
            return textRepository.save(existText);
        }
        return null;
    }

    // delete a text
    public void deleteText(Long id) {
        textRepository.deleteById(id);
    }
}
