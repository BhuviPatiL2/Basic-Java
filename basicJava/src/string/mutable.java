package string;

public class mutable {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Bhuvaneshwari");
		System.out.println(sb.capacity());
		sb.append(" Patil");
		System.out.println(sb.capacity());
		System.out.println(sb);
		
		//sb.deleteCharAt(6);
		//System.out.println(sb);
		
		sb.delete(13, 19);
		System.out.println(sb);
		
		
		sb.replace(0, 4, "Bhuvi");
		System.out.println(sb);
		
		
		sb.insert(5, 22);
		System.out.println(sb);
	}

}
