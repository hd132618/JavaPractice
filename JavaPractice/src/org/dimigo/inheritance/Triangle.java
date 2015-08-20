package org.dimigo.inheritance;

public class Triangle extends Figure {
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		super(0,0);
		this.width = width;
		this.height = height;
	}
	
	public Triangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected void printCenter() {
		System.out.println("삼각형 중심좌표 : (" + centerX + ", " + centerY + ")");
	}

	protected double calcArea() {
		return width * height * 1/2;
	}
}
