package main.javacom.example.springboot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
  private Long id;
  private String name;
  private String category;
  private Double price;
  private int quantity;
}
