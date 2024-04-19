package com.junia.demo.controller.api;

import com.junia.demo.repository.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AuthorsController {

    @Autowired
    private com.junia.demo.repository.AuthorsRepository AuthorsRepository;
    @Autowired
    private AuthorsRepository authorsRepository;

    @GetMapping("/authors/signin")
    public String displaySigninForm(Model model) {
        model.addAttribute("newAuthor", new Author());
        return "authorsList";
    }

    @PostMapping("/authors/singin")
    public String submitForm(Authors author, Model model) {
        public boolean Author
        AuthorsRepository.save(author);
        System.out.println(author.getLname());
        System.out.println(author.getPassword());
        return "redirect:/authors/";
    }


    @GetMapping("/authors") // Défini l'url /authors
    public String displayAuthorsList(Model model) {
        List<Authors> authorsList = (List<Authors>) AuthorsRepository.findAll();

        // Ajout de mes données dans la vue (Model)
        model.addAttribute("author", authorsList);
        // Affiche la page authorList
        return "authorList";
    }

    private class Author {
    }
}
