package com.sist.docker0320spring;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<SampleT, Integer> {
}
