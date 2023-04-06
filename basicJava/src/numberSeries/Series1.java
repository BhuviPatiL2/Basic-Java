package numberSeries;
//1,3,7,13,21,31,43
public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=1,b=1;
		for(int i=1;i<=6;i++) {
			System.out.print(s+"  ");
			s=s+(i+1)*(i+1);
		}

	}

}
