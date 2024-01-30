package com.booleanuk.api.requests.controllers;

import com.booleanuk.api.requests.model.Author;
import com.booleanuk.api.requests.repositories.AuthorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("authors")
public class AuthorController {
    private AuthorRepository theAuthors;

    public AuthorController()   {
        this.theAuthors = new AuthorRepository();
    }

    @GetMapping
    public ArrayList<Author> getAll()   {
        return theAuthors.getAllAuthors();
    }

    @GetMapping("{id}")
    public Author getOne(@PathVariable int id)    {
        return this.theAuthors.getOneAuthor(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Author create(@RequestBody Author author)    {
        return this.theAuthors.createAuthor(author);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Author update(@PathVariable int id, @RequestBody Author author)  {
        return this.theAuthors.updateAuthor(id, author);
    }

    @DeleteMapping("{id}")
    public Author delete(@PathVariable int id)  {
        return this.theAuthors.deleteAuthor(id);
    }
}
