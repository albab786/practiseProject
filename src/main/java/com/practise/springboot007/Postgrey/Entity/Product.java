package com.practise.springboot007.Postgrey.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {

	@Id
	private Integer productid;
	private String shopName;
	private Integer totalPrice;
}
