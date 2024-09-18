package com.example.demo.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

@Repository
@Profile("dev")
public interface ProductRepository extends JpaRepository<Product,Long>{
	
	

}
