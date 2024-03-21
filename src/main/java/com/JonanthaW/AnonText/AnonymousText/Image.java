package com.JonanthaW.AnonText.AnonymousText;

import jakarta.persistence.*;

@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getText_id() {
        return text_id;
    }

    public void setText_id(Long text_id) {
        this.text_id = text_id;
    }

    private Long text_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Lob
    private byte[] data;
}