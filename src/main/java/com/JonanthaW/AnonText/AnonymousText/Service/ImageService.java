package com.JonanthaW.AnonText.AnonymousText.Service;

import com.JonanthaW.AnonText.AnonymousText.Image;
import com.JonanthaW.AnonText.AnonymousText.Repo.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public void saveImage(MultipartFile file) throws IOException {
        Image image = new Image();
        image.setData(file.getBytes());
        imageRepository.save(image);
    }

    public Image getImage(Long id) {
        return imageRepository.findById(id).orElse(null);
    }
}
