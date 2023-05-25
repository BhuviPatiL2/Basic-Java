package constructor;

public class Tree {
	Tree (){
		System.out.println("Tree constructor");
	}
public static void main(String[] args) {
	Tree t=new Tree();
	Tree t1=new Tree();
	Tree t2=new Tree();
	Tree t3=new Tree();
}
}
