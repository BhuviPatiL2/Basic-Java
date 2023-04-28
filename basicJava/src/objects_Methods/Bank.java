package objects_Methods;

public class Bank {
public static void main(String[] args) {
	Person p2=new Person();
	Payment t=p2.send();
	 System.out.println(t.getP_Id());
	 System.out.println(t.getP_mode());
	 System.out.println(t.getBalance());
	
}
}
