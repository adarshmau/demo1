package com.example.demo1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Price {
	
	@Id
	private Integer id;
	private String product;
	private String resurce;
	private Double price;

}
