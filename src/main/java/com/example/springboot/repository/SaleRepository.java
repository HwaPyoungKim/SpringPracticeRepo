package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springboot.models.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
  
}
