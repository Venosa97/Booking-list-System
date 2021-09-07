package mostenire_Inheritance;

public class OnAir extends Vehicle {
	
	private int noTurbines;
	private String hasFirstClass;
	
	public OnAir (String serialNumber,int noPersons) {
		super(serialNumber, noPersons);
		this.noTurbines = 2;
	}
	
	public OnAir (String serialNumber, int noPersons, String name) {
		super(serialNumber,noPersons,name);
		this.noTurbines = 2;
	}
	
	public OnAir (String serialNumber, int noPersons, String name, int noTurbines) {
		this(serialNumber,noPersons,name);
		this.noTurbines = noTurbines;
	}
	
	public OnAir(String serialNumber, int noPersons, String name, int noTurbines, String hasFirstClass) {
		this(serialNumber,noPersons,name,noTurbines);
		hasFirstClass = hasFirstClass.toLowerCase();
		if (hasFirstClass.equals("has first class") || hasFirstClass.equals("does not have first class")) {
			this.hasFirstClass = hasFirstClass;
		}else {
			this.hasFirstClass = "Error";
		}
		
	}
	
	@Override
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Flying the airplane to coordinates: [" + positionX + ", " + positionY + "]");
		return true;
	}
	
	@Override
	public boolean addFuel(double amount) {
		System.out.println("Adding " + amount + " l of fuel to the airplane");
		return true;
	}
	
	@Override
	public void printInfo() {
		System.out.println("Vehicle properties:\r\n"
				+ "	- serial number: " + getSerialNumber() + "\r\n"
				+ "	- capacity: " + getNoPersons() + "\r\n"
				+ "	- name: " + getName());
		System.out.println("Airplane properties:\r\n"
				+ "	- number of turbines: " + this.noTurbines + "\r\n"
				+ "	- " + this.hasFirstClass);
	}
	
}
