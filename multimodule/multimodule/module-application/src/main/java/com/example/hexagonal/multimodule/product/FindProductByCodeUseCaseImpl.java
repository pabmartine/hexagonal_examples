package com.example.hexagonal.multimodule.product;

import com.example.hexagonal.multimodule.domain.Product;
import com.example.hexagonal.multimodule.ports.repository.ProductRepository;
import com.example.hexagonal.multimodule.ports.usecase.FindProductByCodeUseCase;
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
