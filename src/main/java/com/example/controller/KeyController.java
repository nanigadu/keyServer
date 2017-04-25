package com.example.controller;

import com.example.service.KeyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ResourceNotFoundException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeyController {

  @Autowired
  private KeyService keyService;

  @RequestMapping("/E1")
  public String generateKey() {
    return keyService.generatekeys();
  }

  @RequestMapping("/E2")
  public String getKey() {
    if(keyService.getKey().equals("noKey"))
      throw new ResourceNotFoundException(propertyName, resource)
    return keyService.getKey();
  }

}
