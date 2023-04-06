package shwetaPractice;

public class Tree {
	String name = "Peepal";
	double height;
	boolean giveFruite;
	
	void givewater() {
		int noOfTimes=2;
		System.out.println("Give Water To Plants "+noOfTimes+" hours");
		givewater1();
			
	}
	void givewater1() {
		int noOfTimes=2;
		System.out.println("Give Water To Plants "+noOfTimes);
			
	}

	public static void main(String[] args) {
		Tree t1 = new Tree();
		System.out.println(t1.name + " " + t1.height + " " + t1.giveFruite);
		
		Tree t2 = new Tree();
		System.out.println(t2.name + " " + t2.height + " " + t2.giveFruite);

		Tree t3 = new Tree();
		System.out.println(t3.name + " " + t3.height + " " + t3.giveFruite);
		
		t1.givewater();
		t2.givewater1();
		

	}
	

}
