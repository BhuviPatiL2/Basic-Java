package object_InstanceBlock_variableShadowing;

public class ATM {
	Money dispence() {
		Money m = new Money();
		return m;
	}
}

class Money {

}

class test {
	public static void main(String[] args) {
		ATM a = new ATM();
		a.dispence();
	}
}