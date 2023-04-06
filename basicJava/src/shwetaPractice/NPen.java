package shwetaPractice;

public class NPen {
	
	String color;
	void write ()
	{
	System.out.println(this.color);
	}
	
	public static void main(String[] args) {
    NPen p1= new NPen ();
    p1.color = "yellow";
    NPen p2= new NPen ();
    p2.color = "blue";
    NPen p3= new NPen ();
    p3.color= "red";
    
    p1.write ();
    p2.write ();
    p3.write ();
    

	}

}
