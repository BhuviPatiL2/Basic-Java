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
		
		Integer a1=new Integer (300);
		int j1=a1.intValue();                //coverting integer to int explicitly 
		int i1=a1;                          //unboxing, now compiler will write a.intValue() internally
		
		System.out.println("Unboxing "+j1+"     "+i1);
		
		
		//System.out.println(i1);
		Integer it1 = 100;
		//int a1 = it1.intValue();
		int a2 = it1;
	//	System.out.println(a2);
		Integer i2 = 1000;

		
		//method
		
		System.out.println(Integer.compare(i1, a2));  //300     100
		System.out.println("Max limit :"+Integer.MAX_VALUE);
		System.out.println("Min limit :"+Integer.MIN_VALUE);
		System.out.println("Compares :"+Integer.compare(200, 100));
		System.out.println(Integer.compress(10, 5));
		System.out.println(Integer.toBinaryString(22));
		System.out.println(Integer.toHexString(1101));
		System.out.println(Character.isUpperCase('b'));
		System.out.println(Character.isDigit('d'));
		System.out.println(Character.isDigit('c'));
		
	}

}
