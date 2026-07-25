package com.example.springboot.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.example.springboot.dto.BranchDTO;
import com.example.springboot.repository.BranchRepository;

@Service
public class BranchServiceImpl implements BranchService {

  @Autowired
  private BranchRepository branchRepository;

  @Override
  public List<BranchDTO> getAllBranches() {
    return branchRepository.findAll().stream().map(Mapper::toDTO).toList();
  }

  @Override
  public BranchDTO getBranchById(Long id) {
    return branchRepository.findById(id).map(Mapper::toDTO)
    .orElseThrow(() -> new NotFoundException("Branch not found with id: " + id));
  }

  @Override
  public BranchDTO createBranch(BranchDTO branchDTO) {
    Branch branch = Branch.builder()
        .name(branchDTO.getName())
        .address(branchDTO.getAddress())
        .build();
    return Mapper.toDTO(branchRepository.save(branch));
  }

  @Override
  public BranchDTO updateBranch(Long id, BranchDTO branchDTO) {
    Branch branch = branchRepository.findById(id)
        .orElseThrow(() -> new NotFoundException("Branch not found with id: " + id));
    branch.setName(branchDTO.getName());
    branch.setAddress(branchDTO.getAddress());
    return Mapper.toDTO(branchRepository.save(branch));
  }

  @Override
  public void deleteBranch(Long id) {
    if(!branchRepository.existsById(id)) {
      throw new NotFoundException("Branch not found with id: " + id);
    }
    branchRepository.deleteById(id);
  } 
}
