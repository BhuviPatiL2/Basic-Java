//3.	Create a class Person(id,name,contact,address,IdProof idp)
//Create class IdProof (name,number,validity). Create 3 objects of Person class.



package writenTests;

public class Person1 {
	int id;
	String name,contact,address;
	IdProof idp;
	
	String number,validity,iname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	void displayData() {
		System.out.print(id +" "+name +" "+contact +" "+address);
	}
	public void idp(String iname,String  number,String validity) {
		this.iname=iname;
		this.number=number;
		this.validity=validity;
	}
	public static void main(String[] args) {
		Person1 p1=new Person1();
		p1.setId(22);
		p1.setName("Bhuvi");
		p1.setContact("8857982242");
		p1.setAddress("bidu Chauk ,Kolhapur");
		p1.idp("Bhuvi", "51676220181129310010", "12 Aug 2023");
		p1.displayData();
		System.out.println(p1.idp);
		
	}
	
	

}
