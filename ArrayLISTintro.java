package Arraylist;

import java.util.ArrayList;

public class ArrayLISTintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(20);
		arr.add(10);
		arr.add(1, 2);
		arr.add(20);
//		System.out.println(arr.get(1));
//
//		System.out.println(arr.size());
		// print all elements in array list

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		// enchanced for loop
		for (int i : arr) {
			System.out.print(i+"   ");
		}
	}

}
