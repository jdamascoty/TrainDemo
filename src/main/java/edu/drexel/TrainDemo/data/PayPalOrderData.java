package edu.drexel.TrainDemo.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PayPalOrderData {

	private double price;
	private String currency;
	private String method;
	private String intent;
	private String description;

	public double getPrice() {
		return price;
	}

	public String getCurrency() {
		return currency;
	}

	public String getMethod() {
		return method;
	}

	public String getIntent() {
		return intent;
	}

	public String getDescription() {
		return description;
	}

}
