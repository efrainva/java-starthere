package com.lambdaschool.starthere.controllers;

import com.school.sprint.model.Author;
import com.school.sprint.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/author")
public class AuthorControl {
    @Autowired
    private AuthorService autherService;

    @GetMapping(value = "/author", produces = {"application/json"})
    public ResponseEntity<?> listAllAuthors(){
        ArrayList<Author> myauthors= autherService.findAll();
        return new ResponseEntity<>(myauthors, HttpStatus.OK);
    }


}
