package com.example.hexagonal.multimodule.mappers;

import com.example.hexagonal.multimodule.domain.Product;
import com.example.hexagonal.multimodule.entities.ProductEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-17T07:41:30+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.15 (Private Build)"
)
@Component
public class ProductEntityMapperImpl implements ProductEntityMapper {

    @Override
    public Product entity2Domain(ProductEntity entity) {
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
    public ProductEntity domain2Entity(Product entity) {
        if ( entity == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setCode( entity.getCode() );
        productEntity.setDescription( entity.getDescription() );
        productEntity.setCreationDate( entity.getCreationDate() );

        return productEntity;
    }
}
