package interfaces;

public interface BankOp {
	
	abstract void deposite();
	abstract void withdraw();
	abstract void loan();
	default void creditCard()
	{
		System.out.println("Credit card facilities");
	}
	
	
}
