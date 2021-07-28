package com.natwest.exercises.persistence.domain;

import java.util.Objects;

import javax.persistence.*;

@Entity
public class Fruit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String type;
	private int amount;
	private String colour;
	private double price;

	public Fruit() {
		super();

	}

	public Fruit(String type, int amount, String colour, double price) {
		super();
		this.type = type;
		this.amount = amount;
		this.colour = colour;
		this.price = price;
	}

	public Fruit(Long id, String type, int amount, String colour, double price) {
		super();
		Id = id;
		this.type = type;
		this.amount = amount;
		this.colour = colour;
		this.price = price;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getColour() {
		return colour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Fruit [Id=" + Id + ", type=" + type + ", amount=" + amount + ", colour=" + colour + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, amount, colour, price, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(Id, other.Id) && amount == other.amount && Objects.equals(colour, other.colour)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(type, other.type);
	}

}
