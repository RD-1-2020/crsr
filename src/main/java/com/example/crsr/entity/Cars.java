package com.example.crsr.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity(name = "cars")
public class Cars {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "color")
    private String color;

    @Column(name = "release_date")
    private String date;

    public Cars(String id, String name, String color, String date) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.date = date;
    }

    public Cars() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
