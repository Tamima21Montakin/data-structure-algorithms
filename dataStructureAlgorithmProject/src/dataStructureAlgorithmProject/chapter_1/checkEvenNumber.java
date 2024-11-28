package dataStructureAlgorithmProject.chapter_1;

/*
R-1.4 Write a short Java method, isEven, that takes an int i and returns true if and only
if i is even. Your method cannot use the multiplication, modulus, or division
operators, however.
*/
public class checkEvenNumber {
	public static boolean isEven(int i) {
		return (i & 1) == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isEven(4));
		System.out.println(isEven(7));

	}

}

/*
 * Explanation: Without the multiplication, modulus, or division operation to
 * determine whether an integer is even or odd, we can do bitwise & operation
 * with the integer and check the least significant bit. Even if the least
 * significant bit is 0. Odd if the least significant bit is 1.
 */
