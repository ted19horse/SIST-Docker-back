package com.sist.docker0320spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DockerController {
  @GetMapping("/")
  public String index() {
    return "Hello Docker!?!?!!??!?!?!";
  }

  @GetMapping("/sample/all")
  public Map<String, Object> sampleAll() {
    Map<String, Object> map = new HashMap<>();
    return map;
  }
}
