package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {

	FileInputStream file;

	void connection()throws FileNotFoundException,IOException{
		file = new FileInputStream("C:/Users/USER/Documents/Demo.txt");
	}

	void readData() throws Throwable {
		int i, count = 0;
		try {
		while ((i = file.read()) != -1) {
			count++;
			System.out.print((char) i);

		}
		System.out.println();
		System.out.println("Count " + count);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}

}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileInputStream file = new FileInputStream("C:/Users/USER/Documents/Demo.txt")) {
			int i,count=0;
			while ((i = file.read()) != -1) {
				count++;
				System.out.print((char) i );
			
			}
			System.out.println();
			System.out.println("Count "+count);
		}
			
		}

}
