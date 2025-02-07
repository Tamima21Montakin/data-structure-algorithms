package dataStructureAlgorithmProject.chapter_1.chapter_2;

import java.util.Scanner;

public class gameEntry {

	private String name;
	private int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public gameEntry(String name, int score) {
		this.name = name;
		this.score = score;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "(" + name + " , " + score + " )";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner takeInputs = new Scanner(System.in);
		gameEntry dataEntry;
		scoreBoard addScoresBoard = new scoreBoard(5);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the name and score for entry " + (i + 1) + " : ");
			String name = takeInputs.nextLine();

			System.out.print("Score: ");
			int score = takeInputs.nextInt();
			takeInputs.nextLine(); // Consume the newline character

			dataEntry = new gameEntry(name, score);
			addScoresBoard.add(dataEntry);

		}
		addScoresBoard.printScoreBoard();
		takeInputs.close();
//		1. (cook , 1200 )
//		2. (mike , 1105 )
//		3. (tim , 745 )
//		4. (john , 702 )
//		5. (yumi , 562 )

		System.out.println("Delete the record at 4");
		addScoresBoard.removeEntry(4);
		addScoresBoard.printScoreBoard();
	}

}
