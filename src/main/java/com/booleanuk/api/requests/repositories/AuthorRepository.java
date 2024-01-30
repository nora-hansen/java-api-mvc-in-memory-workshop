package com.booleanuk.api.requests.repositories;

import com.booleanuk.api.requests.model.Author;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

public class AuthorRepository {
    private ArrayList<Author> authors;

    public AuthorRepository()   {
        this.authors = new ArrayList<>();

        this.authors.add(new Author(
                "Roald Dahl",
                "roald@giant.com"));
        this.authors.add(new Author(
                "Logicus",
                "logicus@somemail.com"));
    }

    public ArrayList<Author> getAllAuthors()    {
        return this.authors;
    }

    public Author getOneAuthor(int id)  {
        return this.authors.stream()
                .filter(author -> author.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    public Author createAuthor(Author author)   {
        this.authors.add(author);
        return author;
    }

    public Author updateAuthor(int id, Author author)   {
        for(Author theAuthor : this.authors)   {
            if(theAuthor.getId() == id) {
                theAuthor.setEmail(author.getEmail());
                theAuthor.setName(author.getName());
                return theAuthor;
            }
        }
        return null;
    }

    public Author deleteAuthor(int id)  {
        for(Author author : this.authors)   {
            if(author.getId() == id) {
                this.authors.remove(author);
                return author;
            }
        }
        return null;
    }
}
