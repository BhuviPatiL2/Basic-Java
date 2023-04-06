package userInput;
import java.util.Scanner;
public class AvgMarks {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter five subjects marks :"+" ");
    int eng=sc.nextInt();
    int sc1=sc.nextInt();
    int so=sc.nextInt();
    int mt=sc.nextInt();
    int sc2=sc.nextInt();
  int avg=(eng+sc1+so+mt+sc2)/5;
  System.out.println("Averange Marks : "+avg);

	}

}
