package com.natwest.gardeningproject.persistence.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.natwest.gardeningproject.persistence.domain.Plant;

@Entity
public class Plant {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;

	@Column
	private String size;

	@Column
	private Boolean variegated;

	@Column
	private double price;

	public Plant() {
		super();
		}

	public Plant(Long id, String name, String size, Boolean variegated, double price) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
		this.variegated = variegated;
		this.price = price;
	}

	public Plant(String name, String size, Boolean variegated, double price) {
		super();
		this.name = name;
		this.size = size;
		this.variegated = variegated;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public Boolean getVariegated() {
		return variegated;
	}
	
	public void setVariegated(Boolean variegated) {
		this.variegated = variegated;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + ", size=" + size + ", variegated=" + variegated + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, price, size, variegated);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plant other = (Plant) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(size, other.size) && Objects.equals(variegated, other.variegated);
	}
	
	
	

}