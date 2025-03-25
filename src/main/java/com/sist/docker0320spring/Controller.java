package com.sist.docker0320spring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class Controller {
  private final Service service;

  @GetMapping("/")
  public String index() {
    return "Hello Docker!?!?!!??!?!?!";
  }

  @GetMapping("/sample/all")
  public Map<String, Object> sampleAll() {
    Map<String, Object> map = new HashMap<>();

    List<Entity> list = service.getList();
    map.put("list", list);

    return map;
  }
}
