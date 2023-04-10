package writenTests;

public class BanyanTree extends Tree {
	//String medicalUsage;
	String treename="Banyan Tree";
	void displayname() {
		System.out.println("Tree Name: "+treename);
	}
	public void medicalUsage() {
	System.out.println("Banyan tree parts such as fruits, leaves, roots, and barks may be used as herbal medicine");	
	}
	

	public static void main(String[] args) {
		BanyanTree bt= new BanyanTree ();
		bt.displayname();
		bt.givesFlower("givesFlower: No");
		bt.givesFruits("givesFruits: No");
		bt.givesOxygen("givesOxygen: Yes");
		bt.givesShadow("givesShadow: Yes");
		bt.medicalUsage();
		
	}

}
