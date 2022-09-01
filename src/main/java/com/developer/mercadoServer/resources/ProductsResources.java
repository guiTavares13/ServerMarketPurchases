package com.developer.mercadoServer.resources;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.developer.mercadoServer.entities.Products;
import com.developer.mercadoServer.repository.DynamoDbRepository;

@RestController
@RequestMapping(value = "/dynamoDb")
public class ProductsResources {
	
	@Autowired
	private DynamoDbRepository repository;
	
	@GetMapping
	public ResponseEntity<Products> getOneProductDetaisl(@RequestParam int id, @RequestParam String type) {
		Products p = repository.getOneProductDetaisl(id, type);
		return ResponseEntity.ok().body(p);
	}
}
