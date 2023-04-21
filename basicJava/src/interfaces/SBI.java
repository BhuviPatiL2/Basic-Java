package interfaces;

public class SBI implements BankOp{
	@Override
	public void deposite() {
		System.out.println("u can deposite money");
		
	}
	public void withdraw() {
		System.out.println("u can withdraw money ");
		
	}
	public void loan() {
		System.out.println("U can claim for loan ");
		
	}

	

}
