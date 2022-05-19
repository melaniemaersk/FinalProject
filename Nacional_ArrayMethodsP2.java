//Write a method that will return the sum of all the values in a double data type array.
// Pass the array and a size identified by an integer n as parameters

package melanie;

public class Nacional_ArrayMethodsP2 {
		
		static int arr[] = { 14, 23, 8, 15, 6};
		  
	    static int sum()
	    {
	        int sum = 0;
	        int i;
	  
	        for (i = 0; i < arr.length; i++)
	            sum += arr[i];
	  
	        return sum;
	    }
	    
	    public static void main(String[] args)
	    {
	        System.out.println("The total of given array is " + sum());
	    }
	}