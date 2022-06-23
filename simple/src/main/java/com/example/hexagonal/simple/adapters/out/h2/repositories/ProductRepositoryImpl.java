package com.example.hexagonal.simple.adapters.out.h2.repositories;

import com.example.hexagonal.simple.adapters.out.h2.entities.ProductEntity;
import com.example.hexagonal.simple.adapters.out.h2.mappers.ProductEntityMapper;
import com.example.hexagonal.simple.domain.Product;
import com.example.hexagonal.simple.ports.out.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	@Autowired
	private ProductJpaRepository productJpaRepository;

	@Autowired
	private ProductEntityMapper productEntityMapper;

	@Override
	public Product findByCode(String code) {
		return productEntityMapper.entity2Domain(productJpaRepository.findByCode(code));
	}

	@Override
	public void save(Product product) {
		ProductEntity productEntity = productEntityMapper.domain2Entity(product);
		productEntity.setCreationDate(new Date());
		productJpaRepository.save(productEntity);
	}

}