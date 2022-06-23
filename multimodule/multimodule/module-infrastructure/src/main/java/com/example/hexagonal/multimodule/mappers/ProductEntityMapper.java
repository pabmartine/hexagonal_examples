package com.example.hexagonal.multimodule.mappers;

import com.example.hexagonal.multimodule.domain.Product;
import com.example.hexagonal.multimodule.entities.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductEntityMapper {

	Product entity2Domain(ProductEntity entity);

	ProductEntity domain2Entity(Product entity);

}
