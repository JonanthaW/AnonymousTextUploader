package com.JonanthaW.AnonText.AnonymousText.Controller;


import com.JonanthaW.AnonText.AnonymousText.Service.TextService;
import com.JonanthaW.AnonText.AnonymousText.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/text")
public class TextController {
    @Autowired
    private TextService textService;

    @PostMapping
    public Text createText(@RequestBody Text text) {
        return textService.createText(text);
    }

    @GetMapping
    public List<Text> getAllText() {
        return textService.getAllText();
    }

    @GetMapping("/info/{urlCode}")
    public Optional<Text> getTextByUrlCode(@PathVariable String urlCode) {
        return textService.getTextByUrlCode(urlCode);
    }

    @GetMapping("/info/last")
    public List<Text> findFirst10ByOrderByIdDesc() {
        return textService.findFirst10ByOrderByIdDesc();
    }

    @GetMapping("/{id}")
    public Optional<Text> getTextById(@PathVariable Long id) {
        return textService.getTextById(id);
    }


    @PutMapping("/{id}")
    public Text updateText(@PathVariable Long id, @RequestBody Text textDetails) {
        return textService.updateText(id, textDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteText(@PathVariable Long id) {
        textService.deleteText(id);
    }
}
