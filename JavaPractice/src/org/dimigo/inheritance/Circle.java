package org.dimigo.inheritance;

public class Circle extends Figure {
	private int radius;
	
	public Circle(int radius) {
		super(0,0);
		this.radius = radius;
	}
	
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	protected void printCenter() {
		System.out.println("원 중심좌표 : (" + centerX + ", " + centerY + ")");
	}
	
	protected double calcArea() {
		return Math.PI * radius * radius;
	}
}
