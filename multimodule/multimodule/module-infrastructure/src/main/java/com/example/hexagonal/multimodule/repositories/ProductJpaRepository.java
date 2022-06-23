package com.example.hexagonal.multimodule.repositories;

import com.example.hexagonal.multimodule.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, String> {

	ProductEntity findByCode(String code);

}