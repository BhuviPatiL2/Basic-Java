package object_InstanceBlock_variableShadowing;

public class Shadow {
	int i=25;
	void meth() {
		int i=429;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println("-----------------------");
	}
	void anotherMeth() {
		System.out.println(i);
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		
		Shadow s=new Shadow();
		s.meth();
		s.anotherMeth();
	}

}
