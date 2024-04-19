package com.junia.demo.service;

import com.junia.demo.repository.TutorialRepository;
import com.junia.demo.repository.entity.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialService {
    @Autowired
    private TutorialRepository tutorialRepository;

    public List<Tutorial> fetchTutorials() {
        return (List<Tutorial>) tutorialRepository.findAll();
    }
    public Tutorial createTutorial(Tutorial tutorial) {
        return tutorialRepository.save(tutorial);

    }

    public Tutorial addTutorial(Tutorial tutorial) {
        return tutorial;
    }


}
