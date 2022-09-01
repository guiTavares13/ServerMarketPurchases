package com.developer.mercadoServer.entities;

import java.io.Serializable;
import java.util.Objects;

public class Products implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String type;
	private String brand;
	
	public Products() {
		
	}
	
	public Products(Long id, String name, String type, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.brand = brand;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
	
	
}
