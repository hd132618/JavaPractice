/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_ Car
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 *
 * @author     :    이영석
 * @version    :    1.0
 */
public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setCompany(String company_) {
		company = company_;
	}
	
	public void setModel(String model_) {
		model = model_;
	}
	
	public void setColor(String color_) {
		color = color_;
	}
	
	public void setMaxSpeed(int maxSpeed_) {
		maxSpeed = maxSpeed_;
	}
	
	public void setPrice(int price_) {
		price = price_;
	}
}
