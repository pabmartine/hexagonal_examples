package com.example.hexagonal.simple.adapters.in.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Product dto class
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

	@NotNull
	private String code;

	@NotNull
	private String description;

	private Date creationDate;
}