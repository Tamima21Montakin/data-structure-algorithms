package dataStructureAlgorithmProject.chapter_1;

import java.util.Scanner;

public class inputBaseTypes {

	public static void inputAllBaseTypes() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Byte value: ");
		byte byteVal = scanner.nextByte();
		System.out.println("Byte value: " + byteVal);

		System.out.println("Enter a Boolean value: ");
		boolean booleanVal = scanner.nextBoolean();
		System.out.println("Boolean value: " + booleanVal);

		System.out.println("Enter a char value: ");
		char charVal = scanner.next().charAt(0);
		System.out.println("Char value: " + charVal);

		System.out.println("Enter a int value: ");
		int intVal = scanner.nextInt();
		System.out.println("Int value: " + intVal);

		System.out.println("Enter a short value: ");
		short shortVal = scanner.nextShort();
		System.out.println("Short value: " + shortVal);

		System.out.println("Enter a long value: ");
		long longVal = scanner.nextLong();
		System.out.println("Long value: " + longVal);

		System.out.println("Enter a float value: ");
		float floatVal = scanner.nextFloat();
		System.out.println("Float value: " + floatVal);

		System.out.println("Enter a double value: ");
		double doubleVal = scanner.nextDouble();
		System.out.println("Double value: " + doubleVal);

	}

	public static void main(String[] args) {
		inputAllBaseTypes();

	}

}
