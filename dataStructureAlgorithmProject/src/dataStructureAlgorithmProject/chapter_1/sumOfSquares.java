package dataStructureAlgorithmProject.chapter_1;

/*R-1.7 Write a short Java method that takes an integer n and returns the sum of the
squares of all positive integers less than or equal to n.*/

public class sumOfSquares {
	public static int sumUpTo(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i * i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 3;
		System.out.println("Total sum of squares of all positive integers upto" + number1 + " : " + sumUpTo(number1));

	}

}
