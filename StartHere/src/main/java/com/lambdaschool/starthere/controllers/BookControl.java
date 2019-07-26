package com.lambdaschool.starthere.controllers;

import com.school.sprint.model.Book;
import com.school.sprint.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookControl {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/book",produces = {"applivation/json"})
    public ResponseEntity<?> listAllBooks(
            @PageableDefault(page = 0,
            size = 2)
            Pageable pageable){
        List<Book> mybook = bookService.findAll(pageable);
        return new ResponseEntity<>(mybook, HttpStatus.OK);
    }
}
