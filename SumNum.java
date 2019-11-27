
public class SumNum {

	public static void main(String[] args) {
		 int[] arr1 = {1, -2, 3, 4, 5, -6, 7, 8, 9, 10};
	        boolean positive = true;
	        int sum = 0;
	        for (int i = 0; i < 5; i++) {
	            if (arr1[i] < 0) {
	                positive = false;
	            }
	            sum = sum + arr1[i];

	        }
	        if (positive) {
	            System.out.println("Sum of first 5 elements= " + sum);
	        } else {


	            sum = 1;
	            for (int i = 5; i < 10; i++) {

	                sum = sum * arr1[i];


	            }
	            System.out.println("Product of last 5 elements= " + sum);
	  }
    }
}

