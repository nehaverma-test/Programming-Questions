package test.com;

public class RemoveVowelsFromAString {

	public static void main(String[] args) {

		String str = "testing world";
		
		//Any vowel matched in the string is replaced by # sign

		String result = str.replaceAll("[aeiou]", "#");

		System.out.println(result);

	}

}
