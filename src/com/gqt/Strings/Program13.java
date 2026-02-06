package com.gqt.Strings;

public class Program13 {
	static void permute(char[] arr, int index) {
		if (index == arr.length) {
			System.out.println(String.valueOf(arr));
			return;
		}

		for (int i = index; i < arr.length; i++) {
			swap(arr, index, i);
			permute(arr, index + 1);
			swap(arr, index, i); 
		}
	}

	static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		String s = "ABC";
		System.out.println("String :"+s);
		System.out.println("All the permutations of Strings :");
		permute(s.toCharArray(), 0);
	}
}
