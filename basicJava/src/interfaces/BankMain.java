package interfaces;

public class BankMain {

	public static void main(String[] args) {
		SBI s=new SBI();
		s.loan();
		s.deposite();
		s.withdraw();
		
		BankOp obj=new SBI();
		obj.creditCard();
		

	}

}
