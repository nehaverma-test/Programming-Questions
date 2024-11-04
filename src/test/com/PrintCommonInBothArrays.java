package test.com;

import java.util.HashSet;

public class PrintCommonInBothArrays {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 88, 9, 10, 44 };
		int[] b = { 3, 9, 66, 44, 10, 44, 88 };

		// Store the values of array b in the HashSet
		HashSet<Integer> set1 = new HashSet<Integer>();

		for (int num : b) {
			set1.add(num);
		}

		System.out.println("Print HashSet values->");
		System.out.println(set1);

		System.out.println("Print common values in 2 Arrays a and b->");

		for (int i = 0; i < a.length; i++) {
			if (set1.contains(a[i])) {
				System.out.println(a[i]);
			}
		}

	}

}
