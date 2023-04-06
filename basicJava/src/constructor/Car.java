package constructor;

public class Car {
	int id, price;
	String name, company;

	Car() {
		id = -1;
		name = name;
		company = company;
		price = -1;

	}

	Car(int id, String name, String company, int price) {
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
	}

	public String toString() {
		return id + " " + name + " " + company + " " + price;
	}

///	System.out.println(id+" "+name+" "+company+" " +price);
}
