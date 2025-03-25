package com.sist.docker0320spring;

import lombok.RequiredArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {
  private final Repository repository;

  public List<SampleT> getList() {
    return repository.findAll();
  }
}
