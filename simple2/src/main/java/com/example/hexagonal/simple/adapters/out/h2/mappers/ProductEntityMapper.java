package com.example.hexagonal.simple.adapters.out.h2.mappers;

import com.example.hexagonal.simple.adapters.out.h2.entities.ProductEntity;
import com.example.hexagonal.simple.domain.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductEntityMapper {

	Product entity2Domain(ProductEntity entity);

	ProductEntity domain2Entity(Product entity);

}
