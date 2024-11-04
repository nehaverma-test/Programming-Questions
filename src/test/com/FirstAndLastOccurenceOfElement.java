package test.com;

public class FirstAndLastOccurenceOfElement {
	
	
//Explanation-
	
/*We will keep first and Last values as -1 before starting the search
When the loop starts => target value is compared with each value of array
When the array value becomes equal to the target, control goes inside the if loop and if it is the first time 
the value is found --> Value of first becomes the ith location.

After changing the location of first, loop again continues and then starts comparing 
the array value with the target value.

Statement last=i
When target is found again in the array, control goes inside the loop and checks the if statement if(first==-1) as this condition
 fails second time last value is updated with i value
*/
	

	public static void main(String[] args) {

          int[] input = { 66,1,5,3,7,1,7,1,8};
          
          int target = 1;
          int first =-1,last=-1;
          
          for(int i=0;i<input.length;i++)
          {
        	  if(input[i]==target)
        	  {
        		  if(first==-1)
        		  {
        			  first=i;
        		  }
        		  last=i;
        	  }
          }
          

         System.out.println("First locn => "+first);
         System.out.println("Last locn => "+last);
	}

}
