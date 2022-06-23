package com.example.hexagonal.multimodule.mappers;

import com.example.hexagonal.multimodule.domain.Product;
import com.example.hexagonal.multimodule.dto.ProductDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-17T07:41:31+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.15 (Private Build)"
)
@Component
public class ProductDtoMapperImpl implements ProductDtoMapper {

    @Override
    public Product dto2Domain(ProductDto entity) {
        if ( entity == null ) {
            return null;
        }

        Product product = new Product();

        product.setCode( entity.getCode() );
        product.setDescription( entity.getDescription() );
        product.setCreationDate( entity.getCreationDate() );

        return product;
    }

    @Override
    public ProductDto domain2Dto(Product entity) {
        if ( entity == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setCode( entity.getCode() );
        productDto.setDescription( entity.getDescription() );
        productDto.setCreationDate( entity.getCreationDate() );

        return productDto;
    }
}
