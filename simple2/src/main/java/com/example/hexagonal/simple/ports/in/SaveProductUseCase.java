package com.example.hexagonal.simple.ports.in;

import com.example.hexagonal.simple.domain.Product;

public interface SaveProductUseCase {

	public void execute(Product product);

}
