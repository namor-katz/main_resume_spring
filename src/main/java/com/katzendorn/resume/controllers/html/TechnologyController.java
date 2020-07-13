package com.katzendorn.resume.controllers.html;

import com.katzendorn.resume.services.interfaces.TechnologyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class TechnologyController {
    private final TechnologyService technologyService;

    @GetMapping("/")
    public String getTechnologyPage() {
        return "technology";
    }

}
