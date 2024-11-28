package dataStructureAlgorithmProject.chapter_1;

/*R-1.8 Write a short Java method that counts the number of vowels in a given character
string.*/
public class countVowelNumbers {

	public static int countOfVowels(String str) {
		int count = 0;
		String vowelString = "aeiouAEIOU";
		for (char c : str.toCharArray()) {
			if (vowelString.indexOf(c) != -1) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Animal";
		System.out.println("Total count of vowels in the string " + input + " : " + countOfVowels(input));

	}

}
