package com.hyperlocalstore.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyperlocalstore.springboot.model.productDetails;

public interface ProductRepository extends JpaRepository<productDetails, Long> {

}
