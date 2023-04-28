package encapsulation;

public class BusTicket {

	BusTicket b = new BusTicket();
	private int ticketNo;
	private float ticketPrice;
	private float totalAmount;
	Person person;

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void calculateTotal() {
		float price = b.ticketPrice ;
		float d;
		int gen=0;
		
		b.ticketPrice = price;
		Person p1 = new Person();
		p1.gender=(char)gen;
		if (16 > p1.age) {
			 d = (price * 50) / 100;
			price = price - d;

			System.out.println(price);

		}else if(p1.age>=60) {
			 d = (price * 25) / 100;
				price = price - d;

				System.out.println(price);
			
		}
	
	if(gen==102 ||gen==70) {
		d = (price * 10) / 100;
		price = price - d;

		System.out.println(price);
		
		
	}
	
	
		
	}

}
