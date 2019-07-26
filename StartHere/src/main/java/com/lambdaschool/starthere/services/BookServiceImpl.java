package com.lambdaschool.starthere.services;

import com.school.sprint.model.Book;
import com.school.sprint.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepo bookRepo;

    public List<Book> findAll(Pageable pageable){
        List<Book> list = new ArrayList<>();
        bookRepo.findAll(pageable).iterator().forEachRemaining(list::add);
        return list;
    }
}
