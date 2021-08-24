package com.examples.loans.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//import com.examples.users;
//import com.examples.users.controller;

@RestController
public class LoansService {
   @Autowired
   RestTemplate restTemplate;

   @RequestMapping(value = "/loans")
   public Users getUsersList() {
      HttpHeaders headers = new HttpHeaders();
      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
      HttpEntity <String> entity = new HttpEntity<String>(headers);
      
      return restTemplate.exchange("http://localhost:8085/users/99", HttpMethod.GET, entity, Users.class).getBody();
   }
}