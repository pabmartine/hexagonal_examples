package com.example.hexagonal.simple.adapters.in.rest.mappers;

import com.example.hexagonal.simple.adapters.in.rest.dto.ProductDto;
import com.example.hexagonal.simple.domain.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductDtoMapper {

	Product dto2Domain(ProductDto entity);

	ProductDto domain2Dto(Product entity);

}
