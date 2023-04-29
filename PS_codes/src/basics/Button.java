package basics;

public class Button {
	String label;

	public void click() {
		System.out.println("Click here");

	}

	public void mouseOver() {
		System.out.println("Mouse hover");

	}

	Button() {
		System.out.println("HIIII");

	}

	public static void main(String[] args) {
		Button b = new Button();
		b.label = "OKK";
		System.out.println(b.label);
		b.click();
		b.mouseOver();
	}

}
