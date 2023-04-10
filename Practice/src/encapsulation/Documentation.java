package encapsulation;

public class Documentation extends Employee {
	String mobileNum,email;
	int pincode;
	
	void contact(String mobileNum,String email,int pincode) {
	this.mobileNum=mobileNum;
	this.email=email;
	this.pincode=pincode;
	System.out.println(mobileNum+email+pincode);
	
	}
	void contact(String mobileNum,String email) {
		this.mobileNum=mobileNum;
		this.email=email;
		System.out.println(mobileNum+email);
		
	}
	void contact(String mobileNum,int pincode) {
		this.mobileNum=mobileNum;
		this.pincode=pincode;
		System.out.println(mobileNum+pincode);
	}
	 
	
   void hike() {
	   System.out.println("sorry you are not applicable");
	}

}
