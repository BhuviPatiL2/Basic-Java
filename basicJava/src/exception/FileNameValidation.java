package exception;

public class FileNameValidation {
public void validation(String s) throws FileNameException {
	if(s.contains(" ")) {
		throw new FileNameException("Space not allowed while naming a file");
	}else {
		System.out.println("valid file name ");
	}
}
	public static void main(String[] args) throws FileNameException {
		String s="Filejava";
		FileNameValidation obj=new FileNameValidation();
		obj.validation(s);
		
	

	}

}
