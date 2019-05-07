package com.service.betaservice.entry.controllers;

import com.service.betaservice.dblayer.entities.UsersEntities;
import com.service.betaservice.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/database")
public class MainController {
    @Autowired
    private UsersRepository usersRepository;
    private UsersEntities usersEntities;

    MainController(UsersEntities usersEntities){
        this.usersEntities=usersEntities;
    }

    @GetMapping(path = "/add")
    public @ResponseBody
    UsersEntities addNewUser(@RequestParam String fullName) {
       // usersEntities.setId(3);
        usersEntities.setFullName(fullName);
        usersRepository.save(usersEntities);
        return usersEntities;
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<UsersEntities> getAllUsers() {

        return usersRepository.findAll();
    }

}
