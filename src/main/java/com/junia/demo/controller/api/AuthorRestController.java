package com.junia.demo.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class AuthorRestController {

    private List<Authors> authorsList;

    public AuthorRestController() {
        authorsList = new ArrayList<>();
        authorsList.add(new Authors(1L,"Spring","String", "String","String"));
    }

    @GetMapping("/api/authors/{id}")
    public ResponseEntity<Authors> fetchById(@PathVariable("id") Long id) {
        Optional<Authors> optAuthors = authorsList
                .stream()
                .filter(t -> t.getId().equals(id))
                .findFirst();
        if (optAuthors.isPresent()) {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(optAuthors.get());
        } else {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .build();
        }

    }


    @GetMapping("/api/authors")
    public ResponseEntity<List<Authors>> getAuthors() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(authorsList);
    }


}
