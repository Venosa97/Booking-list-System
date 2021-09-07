package mostenire_Inheritance;

public class OnWater extends Vehicle {
	
	private int noEngines;
	private double cargoCapacity;
	
	//constructors
	public OnWater (String serialNumber,int noPersons) {
		super(serialNumber,noPersons);
		this.noEngines = 2;
		
	}
	
	public OnWater (String serialNumber,int noPersons,String name) {
		super(serialNumber,noPersons,name);
		this.noEngines = 2;
	}
	
	public OnWater (String serialNumber,int noPersons,String name, int noEngines) {
		this(serialNumber,noPersons,name);
		this.noEngines = noEngines;
	}
	
	public OnWater(String serialNumber, int noPersons, String name, int noEngines, int cargoCapacity) {
		this(serialNumber,noPersons,name, noEngines);
		this.cargoCapacity = cargoCapacity;
	}
	
	@Override
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Sailing the vessel to coordinates: [" + positionX + ", " + positionY + "]");
		return true;
	}
	
	@Override
	public boolean addFuel(double amount) {
		System.out.println("Adding " + amount + " l of fuel to the vessel");
		return true;
	}
	
	@Override
	public void printInfo() {
		System.out.println("Vehicle properties:\r\n"
				+ " - serial number: " + getSerialNumber() + "\r\n"
				+ " - capacity: " + getNoPersons() + "\r\n"
				+ " - name: " + getName());
		System.out.println("Vessel properties:\r\n"
				+ "	- number of engines: " + this.noEngines + "\n"
				+ "	- cargo capacity: " + this.cargoCapacity);
	}
}
