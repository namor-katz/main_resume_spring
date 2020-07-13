package com.katzendorn.resume.repositores;

import com.katzendorn.resume.models.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TechnologyRepository extends JpaRepository<Technology, Long> {
//    Technology findById(Long id);
}
