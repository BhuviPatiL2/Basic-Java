package wrapperClass;

public class Demo2 {
String s="bb5bjdj8dhfn9shdb1";

char ch1[]=s.toCharArray();
int sum=0;
public void meth(int ch1[]) {
	for(int i=0;i<ch1.length;i++){
	
		char ch11=s.charAt(i);
		if(ch11=='0'||ch11=='1'||ch11=='2'||ch11=='3'||ch11=='4'||ch11=='5'||ch11=='6'||ch11=='7'||ch11=='8'||ch11=='9')
	sum=sum+ch11;
	}
	System.out.println(sum);
}

	public static void main(String[] args) {
	
		 Demo2  d=new  Demo2 ();
		
	d.meth(null);
	}

}
