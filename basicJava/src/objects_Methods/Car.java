package objects_Methods;

public class Car {

		int id,launchyear;
		String name,company;
		float price;
		
		void setStudentData(int id,int launchyear,String name,String company,float price) {
			this.id=id;
			this.launchyear=launchyear;
			this.name=name;
			this.company=company;
			this.price=price;
			this.display();

		}
	   void display() {
		   System.out.println(id+" "+launchyear+" "+name+" "+company+" "+price);
	   }
	

	}


