package com.hyperlocalstore.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hyperlocalstore.springboot.model.productDetails;
import com.hyperlocalstore.springboot.model.storeModel;
import com.hyperlocalstore.springboot.repository.ProductRepository;
import com.hyperlocalstore.springboot.repository.StoreRepository;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/")
public class StoreController {
	
	@Autowired
	private StoreRepository storeRepository;
	
	
	//Retrieve all the entries in Database
	@GetMapping("/store-details")
	public List<storeModel> getStoreDetails(){
		return storeRepository.findAll();
	}
	
	//Save an entry to the database
	@PostMapping("/store-details")
	public storeModel createStore(@RequestBody	storeModel i) {
		return storeRepository.save(i);
	}
	
	//find store by id
	@PutMapping("/store-details/{id}")
	public storeModel updateStore(@PathVariable("id") storeModel i) {
		return storeRepository.save(i);
	}
	
	@Autowired
	private ProductRepository productRepository;
	
	//Retrieve all the entries in Database
	@GetMapping("/product-details")
	public List<productDetails> getProductDetails(){
		return productRepository.findAll();
	}
	
	//Save an entry to the database
	@PostMapping("/product-details")
	public productDetails createProduct(@RequestBody productDetails i) {
		return productRepository.save(i);
	}

}
