package mostenire_Inheritance;

public class OnRoad extends Vehicle {
	private int noWheels;
	private int noDoors;
	
	//constructors
	public OnRoad (String serialNumber, int noPersons) {
		super(serialNumber,noPersons);
		this.noWheels = 4;
		this.noDoors = 4;
	}
	
	public OnRoad (String serialNumber,int noPersons,String name) {
		super(serialNumber,noPersons,name);
		this.noWheels = 4;
		this.noDoors = 4;
	}
	
	public OnRoad(String serialNumber,int noPersons,String name,int noWheels) {
		this(serialNumber,noPersons,name);
		this.noWheels = noWheels;
	}
	
	public OnRoad(String serialNumber,int noPersons,String name,int noWheels, int noDoors) {
		this(serialNumber,noPersons,name,noWheels);
		this.noDoors = noDoors;
	}
	
	//methods
	
	@Override
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Driving the vehicle on road to coordinates: [" + positionX + ", " + positionY + "]" );
		return true;
	}
	
	@Override
	public boolean addFuel(double amount) {
		System.out.println("Adding " + amount + " l of fuel to the driving vehicle");
		return true;
	}
	
	@Override
	public void printInfo() {
		System.out.println("Vehicle properties:\r\n"
				+ " - serial number: " + getSerialNumber() + "\r\n"
				+ " - capacity: " + getNoPersons() + "\r\n"
				+ " - name: " + getName());
		System.out.println("Driving vehicle properties:\r\n"
				+ "	- number of wheels: " + this.noWheels + "\n"
				+ "	- number of doors: " + this.noDoors);
	}
}
