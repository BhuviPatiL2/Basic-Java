//inheritance assign ex1)
package writenTests;

public class Dog extends Animal {
	public void barking() {
		System.out.println("Dogs are barking");
	}

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eating();
		d.drinking();
		d.barking();
	}

}
