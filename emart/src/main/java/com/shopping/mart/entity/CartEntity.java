package com.shopping.mart.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carts")
public class CartEntity {
	
	@Id
	private Long cid;
	
	private List<Long> productsId;
	
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public List<Long> getProductsId() {
		return productsId;
	}
	public void setProductsId(List<Long> productsId) {
		this.productsId = productsId;
	}

}
