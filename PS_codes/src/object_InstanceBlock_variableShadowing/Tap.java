package object_InstanceBlock_variableShadowing;

public class Tap {
	Water tapOn(String s) {                 //non primitive data type
		Water w = new Water();
		System.out.println("hii");
		return w;                          //return object reference
	}

	public static void main(String[] args) {
		Tap t=new Tap();
		t.tapOn("Bhuvi");

	}

}
class Water{
}

