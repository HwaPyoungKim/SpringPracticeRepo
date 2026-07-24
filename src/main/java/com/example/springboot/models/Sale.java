package main.java.com.example.springboot.models;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sale {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private LocalDate date;
  private String state;
  private Double totalAmount;

  @ManyToOne
  private Branch branch;

  @OneToMany(mappedBy = "sale")
  private List<SaleDetail> details = new ArrayList<>();

}
