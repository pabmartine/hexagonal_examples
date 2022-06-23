package com.example.hexagonal.simple.application;

import com.example.hexagonal.simple.domain.Product;
import com.example.hexagonal.simple.ports.in.FindProductByCodeUseCase;
import com.example.hexagonal.simple.ports.out.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindProductByCodeUseCaseImpl implements FindProductByCodeUseCase {

	@Autowired
	ProductRepository productRepository;

	@Override
	public Product execute(String code) {
		return this.productRepository.findByCode(code);
	}
}
