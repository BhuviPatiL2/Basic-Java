package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyBlock {

	
	public static void main(String[] args) throws FileNotFoundException {
		try (FileInputStream file = new FileInputStream("C:/Users/USER/Documents/demo.txt")) {
			
		int i;
		while((i=file.read())!=-1) {
			System.out.print((char)i+" ");
		}
		System.out.println();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("ThankYou");
		}
	
	}

}
