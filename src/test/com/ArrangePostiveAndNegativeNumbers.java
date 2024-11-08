package test.com;

public class ArrangePostiveAndNegativeNumbers {

	public static void main(String[] args) {
		
		int[] arr ={1,-1,2,-4,5,-9,-100,6,-10,-88,99};
		 int j = 0; // Pointer to place negative numbers
	        
	        for (int i = 0; i < arr.length; i++) {
	            // If current element is negative, swap it with the element at index j
	            if (arr[i] < 0) {
	                // Swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	                
	                //Counter of j is incremented for next negative number
	                
	                j++; 
	                
	              
	            }
	        }
	        
	    
	        
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }

	}


