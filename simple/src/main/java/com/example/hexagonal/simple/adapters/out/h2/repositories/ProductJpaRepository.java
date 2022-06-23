package com.example.hexagonal.simple.adapters.out.h2.repositories;

import com.example.hexagonal.simple.adapters.out.h2.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, String> {

	ProductEntity findByCode(String code);

}