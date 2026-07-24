package com.example.springboot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BranchDTO {

  private Long id;
  private String name;
  private String address;

}
