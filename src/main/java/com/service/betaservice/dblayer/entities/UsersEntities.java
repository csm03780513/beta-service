package com.service.betaservice.dblayer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UsersEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

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
