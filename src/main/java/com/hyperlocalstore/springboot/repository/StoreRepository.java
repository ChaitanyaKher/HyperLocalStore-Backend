package com.hyperlocalstore.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hyperlocalstore.springboot.model.storeModel;

@Repository
public interface StoreRepository extends JpaRepository<storeModel, Long> {
	
}
