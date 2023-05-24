package string;

import java.util.Arrays;

public class Demo {
	String s = "Core java and advance java is programing laguage";
	String ch[] = s.split(" ");
int i;
	public void meth() {
		String s1="";
		for ( i = 0; i < ch.length-1; i++) {
			// System.out.print(ch[i]+" ");
			if (!ch[i].equals("java")) {
				s1=s1+ch[i]+" ";
			}	
		}
		System.out.println(s1);
		//System.out.println(Arrays.toString(ch));
		
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.meth();
	}

}
