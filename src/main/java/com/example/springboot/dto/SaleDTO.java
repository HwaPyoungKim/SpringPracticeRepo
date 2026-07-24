package com.example.springboot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaleDTO {
  private Long id;
  private LocalDate date;
  private String state;
  private Long branchId;
  private List<SaleDetailDTO> saleDetails;
  private Double totalAmount;
}
