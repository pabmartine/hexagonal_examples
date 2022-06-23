package com.example.hexagonal.simple.application;

import com.example.hexagonal.simple.domain.Product;
import com.example.hexagonal.simple.ports.in.ProductService;
import com.example.hexagonal.simple.ports.out.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public void save(Product product) {
		this.productRepository.save(product);
	}

	@Override
	public Product findByCode(String code) {
		return this.productRepository.findByCode(code);
	}
}
