package Forme_geometrice_Exercitiu;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle (String text, String material, double width, double height) {
		super(text, material);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle() {
		super();
		this.width = 0;
		this.width = 0;
	}
	
	public void displayRectangleHeight() {
		System.out.println("Rectangle height is: " +  this.height);
	}
	
	@Override
	public double getSize() {
		return width * height;
	}
	
	public String getText() {
		return "alabala";
	}
	
	public String toString() {
		return "Rectangle: height is "+ height + ", width is: " + width + ", made of steel";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height)) {
			return false;
		}
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width)) {
			return false;
		}
		return true;
	}

	
	
	
}
