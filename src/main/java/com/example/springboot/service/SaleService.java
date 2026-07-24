package com.example.springboot.service;

import java.util.List;

import com.example.springboot.dto.SaleDTO;

public interface SaleService {

  List<SaleDTO> getAllSales();
  SaleDTO getSaleById(Long id);
  SaleDTO createSale(SaleDTO saleDTO);
  SaleDTO updateSale(Long id, SaleDTO saleDTO);
  void deleteSale(Long id);

}
