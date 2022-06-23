package com.example.hexagonal.simple.application;

import com.example.hexagonal.simple.domain.Product;
import com.example.hexagonal.simple.ports.in.SaveProductUseCase;
import com.example.hexagonal.simple.ports.out.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveProductUseCaseImpl implements SaveProductUseCase {

	@Autowired
	ProductRepository productRepository;

	@Override
	public void execute(Product product) {
		this.productRepository.save(product);
	}

}
