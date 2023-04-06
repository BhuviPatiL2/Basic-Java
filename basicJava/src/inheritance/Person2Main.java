package inheritance;

public class Person2Main {

	public static void main(String[] args) {
		Doctor d=new Doctor();
	    d.setName("Rhishikesh Mahatugade  ");
	    d.setContact("8857982242  ");
	    d.setAddress("Sambhaji Nagar,Kolhapur");
	    d.setDid(01);
	    d.setSpe("General physician  ");
	    d.setHname("Apple hospital Kolhapur");
	    d.display();
	    
	    Patient p=new Patient();
	    p.setName("Janhvi Jadhav  ");
	    p.setContact("9083568739  ");
	    p.setAddress("Manglawar Peth,Kolhapur");
	    p.setPid(400);
	    p.setDisease("Cold and flu  ");
	    p.display();
		}

	}


