package object_InstanceBlock_variableShadowing;

public class Dog {
	double height = 3.5;

	void jump() {
		double height = 5.5;
		System.out.println(height);  //local variable
		System.out.println(this.height);   //Globel variable
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.jump();
	}

}
