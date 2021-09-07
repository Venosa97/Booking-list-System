package Forme_geometrice_Exercitiu;

public abstract class Shape {
	
	private String text;
	private String material;
	
	public Shape(String text, String material) {
		this.text = text;
		this.material = material;
	}
	
	public Shape() {
		this.text = "none";
		this.material = "none";
	}
	
	public abstract double getSize();


	public abstract String toString();
	
	public abstract String getText();


	public abstract int hashCode();


	public abstract boolean equals(Object obj);

	
}
