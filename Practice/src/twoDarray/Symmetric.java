package twoDarray;

import java.util.Arrays;

public class Symmetric {

	public static void main(String[] args) {
	
	

			int[][] arr = { { 1, 2}, { 4, 5 } };// 00 10 01 11 02 12
			int[][] tranArr = new int[arr[0].length][arr.length];
			for (int j = 0; j < arr[0].length; j++) {
				for (int i = 0; i < arr.length; i++) {
					tranArr[j][i] = arr[i][j];
				}
			}
			for (int i = 0; i < tranArr.length; i++) {
				System.out.println(Arrays.toString(tranArr[i]));
			}
			for (int i = 0; i < tranArr.length; i++) {
			if(tranArr[i]==arr[i]) {
				System.out.println("Symmetric matrix");
		}else {
			System.out.println("NOT Symmetric matrix\"");
		}

	}

	}

}
