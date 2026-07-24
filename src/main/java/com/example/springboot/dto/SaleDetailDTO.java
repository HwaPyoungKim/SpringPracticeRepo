package com.example.springboot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaleDetailDTO {
  private Long id;
  private String product;
  private Integer quantity;
  private Double price;
  private Double partialAmount;
}
