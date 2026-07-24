package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springboot.models.Branch;

public interface BranchRepository extends JpaRepository<Branch, Long> {
  
}
