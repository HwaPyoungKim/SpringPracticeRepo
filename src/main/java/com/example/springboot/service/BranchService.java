package com.example.springboot.service;

import java.util.List;
import com.example.springboot.dto.BranchDTO;

public interface BranchService {

  List<BranchDTO> getAllBranches();
  BranchDTO getBranchById(Long id);
  BranchDTO createBranch(BranchDTO branchDTO);
  BranchDTO updateBranch(Long id, BranchDTO branchDTO);
  void deleteBranch(Long id);

}
