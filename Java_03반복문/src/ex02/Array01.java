package ex02;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		
		int[] nArr = new int[5];
		System.out.println(nArr);
		System.out.println(Arrays.toString(nArr));
		
		
	   
		nArr[0] = 70;
		nArr[1] = 80;
		nArr[2] = 90;
		nArr[3] = 100;
		
		System.out.println(nArr[0]);
		System.out.println(nArr[1]);
		System.out.println(nArr[2]);
		System.out.println(nArr[3]);
		System.out.println(nArr[4]);
   
	}

}
