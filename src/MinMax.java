import java.util.Scanner;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 *
 *	Input Format
 *
 *	A single line of five space-separated integers.
 *
 *	Constraints
 *
 *	Each integer is in the inclusive range .
 *	Output Format
 *
 *	Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated
 *  by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)
 *
 * @author lucasfe
 *
 */

public class MinMax {

	
    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
        
    	int max = arr[0];
    	int min = arr[0];
    	long sum = 0;
    	
    	for (int currItem : arr) {
    		
    		if (currItem > max) {
    			max = currItem;
    		}
    		
    		if (currItem < min) {
    			min = currItem;
    		}
    		
    		sum = sum + currItem;
    	}

    	long sumMax = sum - min;
    	long sumMin = sum - max;

    	System.out.println(sumMin + " " + sumMax);
    	
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
	
}
