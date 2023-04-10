package runTimePoly;
//dynamic mmethod dispatch
//use parennt ref to store child class object
	
public class BankMain{
	public static void main(String[] args) {
   Bank b1;
   b1=new Bank();
   b1.loan();
   
   b1=new SBI();
   b1.loan();
   
 b1=new HDFC();
   b1.loan();


	}
}






