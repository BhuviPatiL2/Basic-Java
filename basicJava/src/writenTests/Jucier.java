package writenTests;

public class Jucier extends Machine {
 @Override 
	void crush() {
	 System.out.println("Starts Crushing"); 
 }
void filter() {
	 System.out.println("Starts filtering ");
	 System.out.println("--------------------------------------------------");
 }
public static void main(String[] args) {
	Jucier j=new Jucier();
	j.crush();
	j.filter();
	Machine m=new Jucier(); //upcasting 
	m.crush();

}
}
