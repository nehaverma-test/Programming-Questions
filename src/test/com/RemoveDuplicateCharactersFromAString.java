package test.com;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharactersFromAString {

	public void removeDuplicates(String input)
	{
		Set<Character> set1 = new HashSet<Character>();
		
		for(char c : input.toCharArray())
		{
			set1.add(c);
			
		}
		
		System.out.println(set1);
	
	
	StringBuilder sb = new StringBuilder();
	
	for(char e : set1)
	{
		sb.append(e);
	}
	System.out.println(sb);
	}
	
	
	
	
	public static void main(String[] args) {
	
		RemoveDuplicateCharactersFromAString rc =  new RemoveDuplicateCharactersFromAString();
		rc.removeDuplicates("Automation");

	}

}
