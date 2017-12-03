package com.bokecc.boot.dto;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by lijm on 2017/12/2.
 */
@Entity
@Table(name = "department")
public class Department implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Department() {
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
}