package com.example.springboot.service;

import java.util.List;

import com.example.springboot.dto.ProductDTO;

public interface ProductService {

  List<ProductDTO> getAllProducts();
  ProductDTO getProductById(Long id);
  ProductDTO createProduct(ProductDTO productDTO);
  ProductDTO updateProduct(Long id, ProductDTO productDTO);
  void deleteProduct(Long id);

}
