package com.example.hexagonal.multimodule.ports.usecase;

import com.example.hexagonal.multimodule.domain.Product;

public interface SaveProductUseCase {

	public void execute(Product product);

}
