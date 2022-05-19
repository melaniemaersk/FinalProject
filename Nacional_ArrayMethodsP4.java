// Write a method that will determine whether an integer say x exists or not in an integer array. The method should 
// return 1 if x is in the array, otherwise, it should return 0. Pass the array, a size identified by n, and the integer x as 
// parameters.

package melanie;

public class Nacional_ArrayMethodsP4 {

	public static boolean contains (int[] arr, int item) {
		for (int n : arr) {
			if (item == n) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] array1 = new int [] {
				1789, 2035, 1899, 1456, 2013,
				1458, 2458, 1254, 1472, 2365,
				1456, 2265, 1457, 2456};

		
		System.out.println(contains(array1, 2013));
		System.out.println(contains(array1, 2015));
	}

}
