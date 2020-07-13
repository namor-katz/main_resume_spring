package com.katzendorn.resume.services.interfaces;

import com.katzendorn.resume.models.Technology;

import java.util.List;

public interface TechnologyService {
    List<Technology> getAllTechnology();
    Technology findTechnologyByTitle(String title);

}
