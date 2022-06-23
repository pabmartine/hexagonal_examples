package com.example.hexagonal.simple.ports.out;

import com.example.hexagonal.simple.domain.Product;

public interface ProductRepository {

	public void save(Product product);

	public Product findByCode(String code);

}
