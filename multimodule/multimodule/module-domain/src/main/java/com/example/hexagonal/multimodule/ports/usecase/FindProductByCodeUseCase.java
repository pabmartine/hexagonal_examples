package com.example.hexagonal.multimodule.ports.usecase;

import com.example.hexagonal.multimodule.domain.Product;

public interface FindProductByCodeUseCase {

	public Product execute(String code);
}
