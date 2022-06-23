package com.example.hexagonal.multimodule.product;

import com.example.hexagonal.multimodule.domain.Product;
import com.example.hexagonal.multimodule.ports.repository.ProductRepository;
import com.example.hexagonal.multimodule.ports.usecase.SaveProductUseCase;
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
