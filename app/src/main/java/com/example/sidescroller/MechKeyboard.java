package com.example.sidescroller;

public class MechKeyboard {
    String description;
    int id;

    public MechKeyboard(String description,  int id) {
        this.description = description;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }
    public int getId() {
        return id;
    }

}