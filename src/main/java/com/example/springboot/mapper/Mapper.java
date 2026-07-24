package com.example.springboot.mapper;

import com.example.springboot.dto.ProductDTO;
import com.example.springboot.dto.SaleDTO;
import com.example.springboot.dto.BranchDTO;
import com.example.springboot.dto.SaleDetailDTO;
import com.example.springboot.models.Product;
import com.example.springboot.models.Sale;
import com.example.springboot.models.Branch;

import java.util.stream.Collectors;

public class Mapper {

  //Map from Product to ProductDTO
  public static ProductDTO toDTO(Product product) {
    if (product == null) {
      return null;
    }

    return ProductDTO.builder()
        .id(product.getId())
        .name(product.getName())
        .category(product.getCategory())
        .price(product.getPrice())
        .quantity(product.getQuantity())
        .build();
  }

  //Map from Sale to SaleDTO
  public static SaleDTO toDTO(Sale sale) {
    if (sale == null) {
      return null;
    }

    var detail = sale.getDetails().stream()
        .map(det -> SaleDetailDTO.builder()
            .id(det.getId())
            .product(det.getProduct().getName())
            .quantity(det.getQuantity())
            .price(det.getPrice())
            .partialAmount(det.getPrice() * det.getQuantity())
            .build())
        .collect(Collectors.toList());

    var totalAmount = detail.stream()
        .map(SaleDetailDTO::getPartialAmount)
        .reduce(0.0, Double::sum);

    return SaleDTO.builder()
        .id(sale.getId())
        .date(sale.getDate())
        .state(sale.getState())
        .branchId(sale.getBranch().getId())
        .saleDetails(detail)
        .totalAmount(totalAmount)
        .build();
  }

  //Map from Branch to BranchDTO
  public static BranchDTO toDTO(Branch branch) {
    if (branch == null) {
      return null;
    }

    return BranchDTO.builder()
        .id(branch.getId())
        .name(branch.getName())
        .address(branch.getAddress())
        .build();
  }

}