package br.com.fiap.model;

import java.math.BigDecimal;

public class Setup {
	private String name = "Meu Setup";
	private String description = "Descrição do setup";
	private BigDecimal price = new BigDecimal(2000);


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Setup [name=" + name + ", description=" + description + ", price=" + price + "]";
	}
}
