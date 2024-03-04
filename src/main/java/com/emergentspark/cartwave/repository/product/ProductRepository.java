package com.emergentspark.cartwave.repository.product;

import com.emergentspark.cartwave.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
