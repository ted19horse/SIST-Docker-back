package com.sist.docker0320spring;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@jakarta.persistence.Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class Entity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idx;
  @Column
  private String title;
  @Column
  private LocalDateTime reg_date;
}
