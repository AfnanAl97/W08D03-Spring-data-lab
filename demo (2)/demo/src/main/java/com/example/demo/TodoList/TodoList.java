package com.example.demo.TodoList;

import javax.persistence.*;

@Entity
@Table(name = "todos")
public class TodoList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public TodoList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public TodoList() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TodoList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
