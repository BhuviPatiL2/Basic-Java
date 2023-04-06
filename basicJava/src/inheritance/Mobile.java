package inheritance;

public class Mobile {
	int price;
	
	void makeACall() {
		System.out.println("Make a call");
	}
	void takeAPicture() {
		System.out.println("take a picture");
	}
	void sendAMsg() {
		System.out.println("Send a MSG");
	}
	
	public void setPrice(int price) {
		this.price = price;
	
	}
	public int getPrice() {
		return price;
	}

}
