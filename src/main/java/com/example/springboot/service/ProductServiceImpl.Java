package com.example.springboot.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.example.springboot.dto.ProductDTO;
import com.example.springboot.repository.ProductRepository; 

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductRepository productRepository;

  @Override
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public ProductDTO getProductById(Long id) {
        // Implementation for retrieving a product by ID
        return null;
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        // Implementation for creating a new product
        return null;
    }
    
    @Override
    public ProductDTO updateProduct(Long id, ProductDTO productDTO) {
        // Implementation for updating an existing product
        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        // Implementation for deleting a product
    }
}