package array;

//calcualte the zero in the last fact number
/*Input: n = 5
Output: 1 
Factorial of 5 is 120 which has one trailing 0.*/

public class Trailing_zeroes_factorial {

	public static void main(String arg[]) {

		int result = 0;
		int n = 150;
		while ((n / 5) > 0) {
			result += n / 5;

			n = n / 5;
		}

		System.out.print("Count of trailing 0s-->" + result);
	}

}
