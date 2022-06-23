package com.example.hexagonal.multimodule.controllers;

import com.example.hexagonal.multimodule.dto.ProductDto;
import com.example.hexagonal.multimodule.mappers.ProductDtoMapper;
import com.example.hexagonal.multimodule.ports.usecase.FindProductByCodeUseCase;
import com.example.hexagonal.multimodule.ports.usecase.SaveProductUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Controllers class that receives product requests
 */
@Slf4j
@RestController
@RequestMapping("/rest/product")
public class ProductRestController {

	@Autowired
	private SaveProductUseCase saveProductUseCase;

	@Autowired
	private FindProductByCodeUseCase findProductByCodeUseCase;

	@Autowired
	protected ProductDtoMapper productDtoMapper;

	@ResponseStatus(HttpStatus.OK)
	@PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> save(@Valid @RequestBody ProductDto productDto) {
		saveProductUseCase.execute(productDtoMapper.dto2Domain(productDto));
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/get/{code}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProductDto> get(@PathVariable String code) {
		ProductDto productDto = productDtoMapper.domain2Dto(findProductByCodeUseCase.execute(code));
		return new ResponseEntity<>(productDto, HttpStatus.OK);
	}
}