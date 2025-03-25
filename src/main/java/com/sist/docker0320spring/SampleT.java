package com.sist.docker0320spring;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@jakarta.persistence.Entity
@Table(name = "sample_t")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class SampleT {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idx;
  @Column
  private String title;
  @Column
  private LocalDateTime reg_date;
}
