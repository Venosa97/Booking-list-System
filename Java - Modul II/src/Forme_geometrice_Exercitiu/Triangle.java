package Forme_geometrice_Exercitiu;

public class Triangle extends Shape {
	private double base;
	private double height;
	
	public Triangle () {
		super();
		this.base = 0;
		this.height = 0;
	}
	
	public Triangle (String text, String material, double base, double height) {
		super(text, material);
		this.base = base;
		this.height = height;
	}
	
	public void displayTriangleHeight() {
		System.out.println("Triangle height is: " + this.height);
	}
	
	@Override
	public double getSize() {
		return (base * height) / 2;
	}
	
	public String getText() {
		return "alabala";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(base);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(height);
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
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(base) != Double.doubleToLongBits(other.base)) {
			return false;
		}
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Triangle: height is "+ height + ", base is: " + base + ", made of glass, contains the text: " ;
	}

	
	
}
