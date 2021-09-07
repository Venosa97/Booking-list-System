package mostenire_Inheritance;

public class Vehicle {
	
	private final String serialNumber;
	private int noPersons;
	private String name;
	
	//constructors
	public Vehicle (String serialNumber, int noPersons){
		this.serialNumber = serialNumber;
		this.setNoPersons(noPersons);
	}
	
	public Vehicle(String serialNumber,int noPersons,String name) {
		this(serialNumber,noPersons);
		this.setName(name);
	}
	
	//methods
	
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Error: unknown vehicle cannot move…");
		return false;
	}
	
	public boolean addFuel(double amount) {
		System.out.println("Error: unknown type of vehicle…");
		return false;
	}
	
	public void printInfo() {
		System.out.println("Vehicle properties:\r\n"
				+ " - serial number: " + this.serialNumber + "\r\n"
				+ " - capacity: " + this.getNoPersons() + "\r\n"
				+ " - name: " + this.getName());
	}

	public int getNoPersons() {
		return noPersons;
	}

	public void setNoPersons(int noPersons) {
		this.noPersons = noPersons;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
}
