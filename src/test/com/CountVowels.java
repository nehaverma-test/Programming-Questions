package test.com;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str1 = sc.next();
		
		//Convert the input word to lower case. Through this we can Reduce the complexity of checking 
		//each character as upper case and upper case letter to be vowel.
		
		String str2 = str1.toLowerCase();
		char ch;
		int count = 0;
		
		for(int i =0;i<str2.length();i++)
		{
			if((str2.charAt(i)=='a')||(str2.charAt(i)=='e')||(str2.charAt(i)=='i')||(str2.charAt(i)=='o')||
					(str2.charAt(i)=='u'))
			{
				count++;
			}
					
		}
		
		System.out.println("Number of Vowels ===> "+count);
 
	}

}
