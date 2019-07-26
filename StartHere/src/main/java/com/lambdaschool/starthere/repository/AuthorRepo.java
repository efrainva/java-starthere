package com.lambdaschool.starthere.repository;

import com.school.sprint.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {
}
