package com.example.hexagonal.multimodule.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Product domain class
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private String code;

	private String description;

	private Date creationDate;


}