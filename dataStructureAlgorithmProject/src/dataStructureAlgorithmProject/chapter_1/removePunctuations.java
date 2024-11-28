package dataStructureAlgorithmProject.chapter_1;

/*R-1.9 Write a short Java method that uses a StringBuilder instance to remove all the
punctuation from a string s storing a sentence, for example, transforming the
string "Let’s try, Mike!" to "Lets try Mike".*/

public class removePunctuations {
	public static String removeThePunctuations(String str) {
		StringBuilder result = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				continue;
			}
			result.append(c);
		}

		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Let’s try, Mike!";
		System.out.println("Let’s try, Mike!");
		System.out.println(removeThePunctuations(str));

	}

}
