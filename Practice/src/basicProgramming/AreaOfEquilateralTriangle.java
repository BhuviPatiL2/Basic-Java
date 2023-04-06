package basicProgramming;

import java.util.*;

public class AreaOfEquilateralTriangle {
	Scanner sc = new Scanner(System.in);
	int a, b, c;

	void eTriangle() {
		System.out.println("enter the side length");
		float a = sc.nextInt();
		float area = 0.43301f * a * a;
		System.out.println("Area of equilateralTriangle :" + area);
	}

     void avg() {
		System.out.println("Enter 5 subjects marks " + " ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int total=a + b + c + d + e;
		int avg = (a + b + c + d + e) / 5;
		int per=(total*100)/500;
		//System.out.println("TOTAL :" + total);
		//System.out.println("Average :" + avg);
		System.out.println("PERCENTAGE :" + per);
	}

	void leapYear() {
		System.out.println("Enter the year");
		a = sc.nextInt();
		if (a % 4 == 0) {
			System.out.println(a + " is leap year!!!");
		} else {
			System.out.println(a + " is not a leap year");
		}

	}
	
	int a() {
		return 10;
		
	}

	void check() {
		System.out.println("Enter any number to check ,that number is divisible by  5 and 11");
		a = sc.nextInt();
		if (a % 5 == 0 && a % 11 == 0) 
			System.out.println(a + " is divisible by 5 and 11");
		 else {
			System.out.println(a + " is NOT divisible by 5 and 11");
		}

	}

	void maximum() {
		System.out.println("enter 1st number: " + " " + "enter 2st number: " + " " + "enter 3rd number: " + " ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println(a + " is greter");
		} else if (b > a && b > c) {
			System.out.println(b + " is greater");
		} else
			System.out.println(c + " is greater");
	}

	void vowelConsonant() {
		System.out.println("Enter any alphabet ");
		char a = sc.next().charAt(0);
		char z = Character.toUpperCase(a);
		switch (z) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(a + " is a vowel");
			break;
		default:
			System.out.println(a + " is a consonant character");
		}

	}

	void calculator() {
		System.out.println("Please select from below : 1)ADDITION \n 2)SUBSTARCTION \n 3)MULTIPLICATION \n 4)DIVISION \n 5)MODULUS");
		a = sc.nextInt();
		System.out.println("Enter two numbers");
		b = sc.nextInt();
		c = sc.nextInt();
		int r;
		switch (a) {
		case 1:
			r = b+c;
			System.out.println("sum : " + r);
			break;
		case 2:
			r = b-c;
			System.out.println("subtraction : " + r);
			break;
		case 3:
			r = b*c;
			System.out.println("multiplication : " + r);
			break;
		case 4:
		if(c==0 &&c<0) {
			System.out.println("error");
		}else {
			r=b/c;
			System.out.println(r);
		}
		}

	}
	void evenOdd() {
		System.out.println("Enter a number");
		a=sc.nextInt();
		if(a%2==0) {
			System.out.println(a +" is even number");
		}else {
			System.out.println(a +" is odd number");
		}
	}
	class   OperatofMath {
		public static void main(String[] args) {
		int a= 5 , b = 4 , c = 3 ;
		System.out.println(a++ + b * ++c);      // 5+4*4=21
		System.out.println ("a = " + a + " b= " + b + " c = " + c);    //a=5 b=4 c=3
		
		System.out.println (b*5/a + b++ + b);                       //20/6+4+4= 20/6+8=48+20/6=68/6
		
		
		
		System.out.println ("a = " + a + " b= " + b + " c = " + c);     //a=5 b=4 c=3
		        }
		}
	


	}

