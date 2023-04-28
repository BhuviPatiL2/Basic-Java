package shwetaPractice;

public class Trees {
	String name;
	double height;
	
	public void water() {
		int noh=2;
		System.out.println("Water the trees for"+noh+" houres");
		System.out.println("Name of the tree: "+name+" height of the tree:"+height);
	}

	public static void main(String[] args) {
		Trees t = new Trees();
		t.name = "Apple";
		t.height = 10.2;
		//System.out.println(noh);
		t.water();

	}

}
