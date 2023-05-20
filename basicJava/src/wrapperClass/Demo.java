package wrapperClass;

public class Demo {

	public static void main(String[] args) {
       
		//autoboxing.................. primitive type to its wrapper class
		int a = 10;        // int data type
		//Integer k = new Integer(a);
		Integer j=Integer.valueOf(a);           //converting int into integer explicitly  
		Integer i= a;                          // Autoboxing ,now compiler will write Integer.valueOf(a) internally
		
		System.out.println("Autoboxing "+j+"   "+i);
		
		
		//unboxing...............Wrapper class to its primitive type
		
		Integer a1=new Integer (3);
		int j1=a1.intValue();                //coverting integer to int explicitly 
		int i1=a1;                          //unboxing, now compiler will write a.intValue() internally
		
		System.out.println("Unboxing "+j1+"     "+i1);
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(i1);
		Integer it1 = 100;
		//int a1 = it1.intValue();
		int a2 = it1;
	//	System.out.println(a2);
		Integer i2 = 1000;

	}

}
