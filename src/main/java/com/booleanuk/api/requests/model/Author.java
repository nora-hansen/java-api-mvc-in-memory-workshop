package com.booleanuk.api.requests.model;

public class Author {
    private static int nextID;
    private int id;
    private String name;
    private String email;

    public Author() {nextID += 1;
        this.id = nextID;}

    public Author(String name,  String email)   {
        nextID += 1;
        this.id = nextID;
        this.name  = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
