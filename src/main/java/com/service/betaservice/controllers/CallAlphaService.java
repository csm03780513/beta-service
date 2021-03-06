package com.service.betaservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;

@RestController
public class CallAlphaService {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/getProducts")
    public String getProducts(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(httpHeaders);
        return restTemplate.exchange(producstURI, HttpMethod.GET,entity,String.class).getBody();
    }


    private String producstURI="http://localhost:3000/products";
}
