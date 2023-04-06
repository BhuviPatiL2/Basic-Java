package writenTests;

public class Person {
	String name;
	String gender, address;
	int age;

	public Person(String name, String gender, String address, int age) {
		this.name = name;
		this.gender = gender;
		this.address=address;
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public static void main(String[] args) {

		Person p1 = new Person("Shweta", "Female", "Kolhapur", 20);
		Address a1=new Address("Kolhapur","Maharashtra","India");

		System.out.print(p1.getName()+" ");
		System.out.print(p1.getGender()+" ");
		System.out.print(p1.getAddress()+" ");
		System.out.print(p1.getAge()+" ");
		System.out.print(a1.getCity()+" ");
		System.out.print(a1.getState()+" ");
		System.out.println(a1.getCountry()+" ");
		
		Person p2= new Person("Shweta", "Female", "Kolhapur", 20);
		Address a2=new Address("Kolhapur","Maharashtra","India");
		
		System.out.print(p2.getName()+" ");
		System.out.print(p2.getGender()+" ");
		System.out.print(p2.getAddress()+" ");
		System.out.print(p2.getAge()+" ");
		System.out.print(a2.getCity()+" ");
		System.out.print(a2.getState()+" ");
		System.out.println(a2.getCountry()+" ");
		
		
	}

}
