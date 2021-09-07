package exercitiuMyIntArrayList;

public class Main {

	public static void main(String[] args) {
		MyIntArrayList c = new MyIntArrayList();
		MyIntArrayList d = new MyIntArrayList();
		c.add(3);
		c.add(32);
		c.add(8);
		c.add(323);
		c.add(77);
		c.add(66);
		
		//d object
		d.add(11);
		d.add(12);
		d.add(13);
		d.add(14);
		d.add(15);
	
		c.addAll(2, d);
		
//		for (int i = 0; i < d.size(); ++i) {
//			System.out.println(d.get(i));
//		}
		
		for (int i = 0; i < c.size(); ++i) {
			System.out.print(c.get(i) + " ");
		}
	}

}
