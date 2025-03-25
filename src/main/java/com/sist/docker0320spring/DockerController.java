package com.sist.docker0320spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
  @GetMapping("/")
  public String index() {
    return "Hello Docker!!!!!!!!!!!!!!!!!!";
  }
}
