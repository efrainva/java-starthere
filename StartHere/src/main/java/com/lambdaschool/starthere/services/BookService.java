package com.lambdaschool.starthere.services;

import com.school.sprint.model.Book;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {
    List<Book> findAll(Pageable pageable);
}
