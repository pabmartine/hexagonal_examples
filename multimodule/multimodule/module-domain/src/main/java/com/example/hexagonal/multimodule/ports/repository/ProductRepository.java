package com.example.hexagonal.multimodule.ports.repository;

import com.example.hexagonal.multimodule.domain.Product;

public interface ProductRepository {

	public void save(Product product);

	public Product findByCode(String code);

}
