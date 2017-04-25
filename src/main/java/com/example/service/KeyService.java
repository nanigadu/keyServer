package com.example.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

@Service
public class KeyService {

  private static ArrayList<String> keys = new ArrayList<>();

  private static HashMap<String, Boolean> usedKeys = new HashMap<>();

  public static String generatekeys() {

    String uuid = UUID.randomUUID().toString();
    while (usedKeys.containsKey(uuid) || keys.contains(uuid)) {
      uuid = UUID.randomUUID().toString();
    }
    keys.add(uuid);
    return "Key added " + uuid;
  }

  public String getKey() {
    if (!keys.isEmpty()) {
      usedKeys.put(keys.get(0), true);
      return keys.remove(0);
    } else {
      return "";
    }
  }

}
