package com.lambdaschool.starthere.repository;

import com.school.sprint.model.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookRepo extends PagingAndSortingRepository<Book, Long> {
}
