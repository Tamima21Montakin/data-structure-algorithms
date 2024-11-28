package dataStructureAlgorithmProject.chapter_1;

import java.util.Scanner;

/*
R-1.3 Write a short Java method, isMultiple, that takes two long values, n and m, and
returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
*/

public class checkMultiple {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter m value: ");
		long m = input.nextLong();

		System.out.println("Enter n value: ");
		long n = input.nextLong();

		boolean isMultipleVal = isMultiple(m, n);

		System.out.println("n is a multiple of m : " + isMultipleVal);

	}

	public static boolean isMultiple(long m, long n) {
		if (m == 0)
			return false;

		return n % m == 0;
	}
}
