package com.example.MindAid.model;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
@Repository
@Entity
@Table(name = "consent_form")
public class Consent {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name = "id")
public int id;
@Column(name = "name")
public String name;
@Column(name = "age")
public int age;
@Column(name = "gender")
public String gender ;
@Column(name = "description")
public String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
