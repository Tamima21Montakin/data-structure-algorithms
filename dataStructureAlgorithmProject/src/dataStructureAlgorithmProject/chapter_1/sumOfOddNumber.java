package dataStructureAlgorithmProject.chapter_1;

/*R-1.6 Write a short Java method that takes an integer n and returns the sum of all the
odd positive integers less than or equal to n.*/

public class sumOfOddNumber {
	public static int sumUpTo(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i += 2) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 10;
		System.out.println("Total sum of all positive odd integeres upto" + number1 + " : " + sumUpTo(number1));

	}

}
