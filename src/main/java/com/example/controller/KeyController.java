package com.example.controller;

import com.example.service.KeyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeyController {

  @Autowired
  private KeyService keyService;

  @RequestMapping("/E1")
  public String generateKey() {
    return KeyService.generatekeys();
  }

  @RequestMapping("/E2")
  public String getKey() {
    return keyService.getKey();
  }

}
