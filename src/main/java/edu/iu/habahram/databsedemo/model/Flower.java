package edu.iu.habahram.databsedemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "flowers", name = "flowers")
public class Flower {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private float cost;
    private String event;
    private String color;

    public Flower() {
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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getEvent(){return event;}

    public void setEvent(){this.event = event;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}
}
