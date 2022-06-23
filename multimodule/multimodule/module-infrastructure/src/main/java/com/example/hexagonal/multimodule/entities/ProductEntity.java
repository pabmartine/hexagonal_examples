package com.example.hexagonal.multimodule.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Product entity class
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCTS")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;

	@Column(name = "CODE", nullable = false)
	private String code;

	@Column(name = "DESCRIPTION", nullable = false)
	private String description;

	@Column(name = "CREATION_DATE", nullable = false)
	@CreationTimestamp
	private Date creationDate;

}