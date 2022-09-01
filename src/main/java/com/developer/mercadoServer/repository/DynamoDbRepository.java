package com.developer.mercadoServer.repository;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.developer.mercadoServer.entities.Products;

public class DynamoDbRepository {
	
	@Autowired
	private DynamoDBMapper mapper;
	
	public Products getOneProductDetaisl(int productId, String type) {
		return mapper.load(Products.class, productId, type);
	}
	
}
