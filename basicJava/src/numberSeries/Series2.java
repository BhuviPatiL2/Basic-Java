package numberSeries;
//0 1 1 2 3 5 8 13 21
public class Series2 {

	public static void main(String[] args) {
	/*	int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2+" ");
		for(int i=0;i<=6;i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}

	}*/
		int m=0,n=1;
		for(int i=1;i<=9;i++) {
			int o=m+n;
			System.out.println(m+" ");
			m=n;
			n=o;
		}

	}
}
