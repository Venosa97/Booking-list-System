package recapitulareIVConcepteDeBazaOOP;
import java.lang.Math;

public class Vehicle {
	
	private static final String producedBy = "Audi";
	private final int productionYear;
	private final String vin;
	private String plateNumber;
	private double kilometers;
	private int lastSoldOnYear;
	private double positionX;
	private double positionY;
	
	// constructors
	public Vehicle(int productionYear, String vin) {
		this.productionYear = productionYear;
		this.vin = vin;
	}
	
	public Vehicle(int productionYear, String vin, String plateNumber, int kilometers, int lastSoldOnYear, double positionX, double positionY) {
		this(productionYear,vin);
		this.plateNumber =  plateNumber;
		this.kilometers =  kilometers;
		this.lastSoldOnYear = lastSoldOnYear;
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	public Vehicle(int productionYear, String vin, String plateNumber, int kilometers) {
		this(productionYear,vin);
		this.plateNumber = plateNumber;
		this.kilometers =  kilometers;
	}
	
	
	// fileds of Vehicle
	public void setPlateNumber (String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public String getPlateNUmber() {
		return this.plateNumber;
	}
	
	public double getKilometers() {
		return this.kilometers;
	}
	
	public void setPositionX(double positionX) {
		this.positionX = positionX;
	}
	
	public double getPostionX() {
		return positionX;
	}
	
	public void setPositionY(double positionY) {
		this.positionY = positionY;
	}
	
	public double getPostionY() {
		return positionX;
	}
	
	
	//interaction methods of objects Vehicle
	public void sellVehicle(String plateNumber, int lastSoldOnYear) {
		this.plateNumber =  plateNumber;
		this.lastSoldOnYear = lastSoldOnYear;
	}
	
	public void moveVehicle(double positionX, double positionY) {
		double newKilometers = Math.sqrt((positionX - this.positionX)*(positionX - this.positionX) + (positionY - this.positionY)*(positionY - this.positionY));
		this.kilometers += newKilometers;
	}
	
	public boolean isVinValid(boolean isDrivingInNorthAmerica) {
		String myVin =  this.vin;
		int[] weightArray = {8,7,6,5,4,3,2,10,0,9,8,7,6,5,4,3,2};
		int sum = 0;
		int counter = 0;
	
		if (weightArray.length != myVin.length()) {
			return false;
		}
		
		if (isDrivingInNorthAmerica) {
			
			for (int i = 0; i < myVin.length(); ++i) {
				int character = (int) myVin.charAt(i);
				
				if (Character.isLowerCase(myVin.charAt(i))) {
					return false;
				}
				
				if (character >= 48 && character <= 57) {
					character -= 48;
					sum += character * weightArray[counter];
					++counter;
					continue;
				}
				
				if ( character <= 72 && character >= 65 ) {
					character -= 64;
					sum += character * weightArray[counter];
					++counter;
					continue;
				}
					
				if (character <= 78 && character >= 74 || character == 82) {
					character -= 73;
					sum += character * weightArray[counter];
					++counter;
					continue;
				}
					
				if (character >= 83 && character <= 90) {
					character -= 81;
					sum += character * weightArray[counter];
					++counter;
					continue;
				}
					
				if (character == 80) {
					character -= 73;
					sum += character * weightArray[counter];
					++counter;
					continue;
					
				} 
				else {
					++counter;
					continue;
				}
			}
		}
		int checkDigit = sum % 11;
		System.out.println("The check digit is: " + checkDigit);
		return true;
	}
	
	public void printVinDecomposed() {
		System.out.println("Identificatorul producatorului: " + this.vin.substring(0,3) + " \n" + "Atributele vehiculului: " + this.vin.substring(3,8)  
				+ " \n" + "Cifra de verificare: " + this.vin.substring(8,9) + "\n" +  "Anul productiei modelului: " + this.vin.substring(9,10) + "\n" 
				+ "Seria fabricii: " + this.vin.substring(10,11)
				+ "\n" + "Identificatorul numeric: " + this.vin.substring(11));
	}
	
	public String display() {
		 return "Masina este produsa de "	+ this.producedBy + " in anul " + this.productionYear + " avand seria VIN "
								+ this.vin + " cu numarul de inmatriculare " + this.plateNumber + " avand " + this.kilometers 
								+ " kilometri. Ultima vanzare a masinii a fost in anul " + this.lastSoldOnYear
								+ " iar conform coordonatelor GPS, masina se afla la latitudinea " + this.positionX
								+ " si longitudinea " + this.positionY; 	
	}
}

