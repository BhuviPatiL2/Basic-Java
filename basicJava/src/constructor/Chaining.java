package constructor;

public class Chaining {
	Chaining(){
		this(10);
		System.out.println("Default");
	}
	Chaining(int a){
		this(10,20);
		System.out.println("two parameter");
	}
	Chaining(int a,int b){
		//this(10,20,30);
		System.out.println("one parameter ");
	}
	Chaining(int a,int b,int c){
		this();
		System.out.println("Default");
	}

	public static void main(String[] args) {
		Chaining c= new Chaining ();
	}

}
