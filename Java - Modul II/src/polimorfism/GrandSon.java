package polimorfism;

public class GrandSon extends Son{
	
	@Override
	public void saySomething() {
		System.out.println("Yes dad, I will buy for grandpa that pills");
	}
	
	public static void main(String[] args) {
		Grandpa theGrandpa = new Grandpa();
		Son theSon = new Son();
		GrandSon theGrandSon = new GrandSon();
		
		theGrandpa.saySomething();
		theSon.saySomething();
		theGrandSon.saySomething();

	}

}
