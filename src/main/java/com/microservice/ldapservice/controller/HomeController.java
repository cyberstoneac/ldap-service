package com.microservice.ldapservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping("/home")
  public String index() {
	  System.out.println("Inside index page");
    return "Welcome to the home page!";
  }

}