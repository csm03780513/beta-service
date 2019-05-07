package com.service.betaservice.dblayer.entities;

import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Service
public class UsersEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private  String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UsersEntities(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UsersEntities(int id) {
        this.id = id;
    }



}
