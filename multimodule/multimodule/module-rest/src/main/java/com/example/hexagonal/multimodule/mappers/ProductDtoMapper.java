package com.example.hexagonal.multimodule.mappers;

import com.example.hexagonal.multimodule.domain.Product;
import com.example.hexagonal.multimodule.dto.ProductDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductDtoMapper {

	Product dto2Domain(ProductDto entity);

	ProductDto domain2Dto(Product entity);

}
