package com.JonanthaW.AnonText.AnonymousText.Controller;


import com.JonanthaW.AnonText.AnonymousText.Image;
import com.JonanthaW.AnonText.AnonymousText.Service.ImageService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/images")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @PostMapping
    public void uploadImage(@RequestParam("file")MultipartFile file) throws IOException {
        imageService.saveImage(file);
    }

    @GetMapping("/{id}")
    public void downloadImage(@PathVariable Long id, HttpServletResponse response) throws IOException {
        Image image = imageService.getImage(id);
        if (image != null) {

            //response.setContentType(MediaType.IMAGE_JPEG_VALUE);
            //response.getOutputStream().write(image.getData());
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
    }
}
