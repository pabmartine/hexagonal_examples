package com.example.hexagonal.simple.ports.in;

import com.example.hexagonal.simple.domain.Product;

public interface FindProductByCodeUseCase {

	public Product execute(String code);
}
