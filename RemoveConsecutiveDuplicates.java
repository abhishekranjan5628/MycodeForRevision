package Arraylist;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {
	public static ArrayList<Integer> remove(int[] arr) {
		// we will crate a new array list
		ArrayList<Integer> RESULT = new ArrayList<>();
		// 10 20 20 20 30 50 10 ka ans 10 20 30 50 10 hoona chahoiye

		// firt element to result me hoga hi

		RESULT.add(arr[0]);
		// 1 idex ko 0 se phir 2 ko 1 se phir 3 ko 2 se aise compare karenge

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) { // 1 index not = to 2nd and so on ....
				RESULT.add(arr[i]);

			}
		}
		return RESULT;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 20, 20, 20, 30, 50, 10 };
		// call hume array list type ki cheej degi usko capture karna hai

		ArrayList<Integer> RESULT = remove(arr);

		for (int I : RESULT) {
			System.out.println(I);
		}

	}

}
