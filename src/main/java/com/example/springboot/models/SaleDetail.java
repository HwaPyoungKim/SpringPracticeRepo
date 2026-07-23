package main.java.com.example.springboot.models;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaleDetail {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  private Sale sale;

  @ManyToOne
  private Product product;
  
  private Integer quantity;
  private Double price;
}
