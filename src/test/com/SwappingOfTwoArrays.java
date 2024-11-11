package test.com;

public class SwappingOfTwoArrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 8, 9, 10 };
		int[] temp = new int[5];

		for (int i = 0; i < 5; i++) {

			temp[i] = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = temp[i];

		}

		System.out.println("Array after swapping : Array1 ");

		for (int a : arr1) {
			System.out.print(a + " ");
		}

		System.out.println();
		
		System.out.println("Array after swapping : Array2 ");
		for (int b : arr2) {
			System.out.print(b + " ");
		}

	}

}
