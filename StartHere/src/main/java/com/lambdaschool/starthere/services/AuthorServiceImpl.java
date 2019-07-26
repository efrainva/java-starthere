package com.lambdaschool.starthere.services;

import com.school.sprint.model.Author;
import com.school.sprint.repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service(value = "authorService")
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepo authorRepo;

    @Override
    public ArrayList<Author> findAll(){
        ArrayList<Author> list = new ArrayList<>();
        authorRepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

}
