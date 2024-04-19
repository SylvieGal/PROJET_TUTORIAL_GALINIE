package com.junia.demo.repository.entity;

import com.junia.demo.controller.api.Authors;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String name;
    private LocalDate createdDate;
    private String description;


    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author authors;

    public Tutorial(long l, String spring, LocalDate now) {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAuthors() {
        return authors;
    }

    public void setAuthors(Author authors) {
        this.authors = authors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tutorial() {

    }
}

    
       
   
