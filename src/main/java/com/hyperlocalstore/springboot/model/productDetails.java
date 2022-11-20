package com.hyperlocalstore.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_details")
public class productDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	@Column(name = "mrp")
	private int mrp;
	@Column(name = "discount_percent")
	private int discountPercent;
	@Column(name = "available_qty")
	private int availableQuantity;
	@Column(name = "discounted_sell_price")
	private int discountedSellingPrice;
	@Column(name = "weight_gms")
	private int weightInGms;
	@Column(name = "is_in_stock")
	private boolean	outOfStock;
	@Column(name = "quantity")
	private int quantity;

	
	public productDetails() {
		super();
	}

	public productDetails(String name, int mrp, int discountPercent, int availableQuantity, int discountedSellingPrice,
			int weightInGms, boolean outOfStock, int quantity) {
		super();
		this.name = name;
		this.mrp = mrp;
		this.discountPercent = discountPercent;
		this.availableQuantity = availableQuantity;
		this.discountedSellingPrice = discountedSellingPrice;
		this.weightInGms = weightInGms;
		this.outOfStock = outOfStock;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMrp() {
		return mrp;
	}

	public void setMrp(int mrp) {
		this.mrp = mrp;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public int getDiscountedSellingPrice() {
		return discountedSellingPrice;
	}

	public void setDiscountedSellingPrice(int discountedSellingPrice) {
		this.discountedSellingPrice = discountedSellingPrice;
	}

	public int getWeightInGms() {
		return weightInGms;
	}

	public void setWeightInGms(int weightInGms) {
		this.weightInGms = weightInGms;
	}

	public boolean isOutOfStock() {
		return outOfStock;
	}

	public void setOutOfStock(boolean outOfStock) {
		this.outOfStock = outOfStock;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
