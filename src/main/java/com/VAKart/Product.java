package com.VAKart;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vakart_product")
public class Product {
@Id
private int prod_id;
private String name;
private int price;
public int getProd_id() {
	return prod_id;
}
public void setProd_id(int prod_id) {
	this.prod_id = prod_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
