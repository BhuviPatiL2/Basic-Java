package inheritance;

public class Swift2 extends Car2 {
	void noOfSeat() {
		  super.noOfSeat();
		 System.out.println("Seat Number \n Maximum 6 people");
		 System.out.println("-------------------------------------------------");
		 
	 }
	 
	 void dashboard() {
		System.out.println(" Dashboard Of Swift: \n 1)engine coolent\n 2)gearshift\n 3)warning light\n 4)parking break warning\n 5)engine mulfuction lights");
		super.dashboard();
		System.out.println("--------------------------------------------------------");
	 }

}
