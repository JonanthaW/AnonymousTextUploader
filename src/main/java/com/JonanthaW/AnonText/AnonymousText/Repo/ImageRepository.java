package com.JonanthaW.AnonText.AnonymousText.Repo;

import com.JonanthaW.AnonText.AnonymousText.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ImageRepository extends JpaRepository<Image, Long> { ;
}
