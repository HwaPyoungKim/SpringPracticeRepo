package main.java.com.example.springboot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class BranchDTO {

  private Long id;
  private String name;
  private String address;

}
