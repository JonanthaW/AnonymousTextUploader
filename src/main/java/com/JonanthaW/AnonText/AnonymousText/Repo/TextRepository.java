package com.JonanthaW.AnonText.AnonymousText.Repo;
import com.JonanthaW.AnonText.AnonymousText.Text;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public interface TextRepository extends JpaRepository<Text, Long> {
    Optional<Text> findByUrlCode(String urlCode);
    List<Text> findFirst10ByOrderByIdDesc(Pageable pageable);
}
