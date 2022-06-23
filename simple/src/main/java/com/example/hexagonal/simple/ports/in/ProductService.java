package com.example.hexagonal.simple.ports.in;

import com.example.hexagonal.simple.domain.Product;

public interface ProductService {

	public void save(Product product);

	public Product findByCode(String code);

}
