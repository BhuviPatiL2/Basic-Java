package inheritance;

class Human {
	String name="Shweta";
	String adharNo="9934 6788 9088";
	String contact="8857982242";

	public void data(String name, String adharNo, String contact) {
		this.adharNo = adharNo;
		this.name = name;
		this.contact = contact;
	}
	void Data() {
		System.out.println("The name of Student "+this.name);
		System.out.println("Her Personal Details :" );
		System.out.println(" Contact Number :" +this.contact+"\n "+"Adhar Number :"+ this.adharNo);
		System.out.println("------------------------------------");
		

	}	

	public String toString() {
		return name + " " + adharNo + " " + contact;
	}
	
		   
		
}
