package com.JonanthaW.AnonText.AnonymousText;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "texts")
public class Text {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = Id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    private String username;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getUnique_visits() {
        return unique_visits;
    }

    public void setUnique_visits(Integer unique_visits) {
        this.unique_visits = unique_visits;
    }

    private String title;

    private Integer unique_visits;

    public Date getCreated_at() {
        return created_at;
    }

    public Date getExpire_date() {
        return expire_date;
    }

    public void setExpire_date(Date expire_date) {
        this.expire_date = expire_date;
    }

    public Date expire_date;

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
    private Date created_at;

    public String getUrlCode() {
        return urlCode;
    }

    public void setUrlCode(String urlCode) {
        this.urlCode = urlCode;
    }

    private String urlCode;
}
