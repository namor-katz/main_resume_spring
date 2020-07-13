package com.katzendorn.resume.services.implementations;

import com.katzendorn.resume.models.Technology;
import com.katzendorn.resume.repositores.TechnologyRepository;
import com.katzendorn.resume.services.interfaces.TechnologyService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor //без этого не делаются приват финалы
public class TechnologyServicesImpl implements TechnologyService {

    private static final Logger logger = LoggerFactory.getLogger(TechnologyServicesImpl.class); //логгер, который нигде не применяется?

    private final TechnologyRepository technologyRepository;

    @Override
    public List<Technology> getAllTechnology() {
        return technologyRepository.findAll();
    }

    @Override
    public Technology findTechnologyByTitle(String title) {
        return technologyRepository.findTechnologyByTitle(title);
    }
}
