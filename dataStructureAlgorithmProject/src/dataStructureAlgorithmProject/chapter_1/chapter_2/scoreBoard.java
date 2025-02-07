package dataStructureAlgorithmProject.chapter_1.chapter_2;

public class scoreBoard {
	private int numOfEntries; // current number of entries
	private gameEntry[] board; // Array that holds the entries

	public scoreBoard(int capacity) {
		this.board = new gameEntry[capacity];
		numOfEntries = 0;
		// TODO Auto-generated constructor stub
	}

	// Method to add a new game entry to the scoreboard
	public void add(gameEntry newEntry) {
		int newScore = newEntry.getScore();

		// If the board is not full or the new score is higher than lowest score
		if (numOfEntries < board.length || newScore > board[numOfEntries - 1].getScore()) {
			if (numOfEntries < board.length) {
				numOfEntries++;
			}

			// shift the lower scores to make room for the new entry

			// keep the index of the lowest score value resides in the board entries
			int j = numOfEntries - 1;
			while (j > 0 && board[j - 1].getScore() < newScore) {
				board[j] = board[j - 1];
				j--;
			}
			// insert the new score
			board[j] = newEntry;
		}

	}

	// Method to remove an entry at a specific index

	public gameEntry removeEntry(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= numOfEntries) {
			throw new IndexOutOfBoundsException("Invalid Index " + index);

		}
		gameEntry removedEntry = board[index];
		for (int j = index; j < numOfEntries - 1; j++) {
			board[j] = board[j + 1];
		}
		board[numOfEntries - 1] = null;
		numOfEntries--;
		return removedEntry;
	}

	public void printScoreBoard() {
		System.out.println("Current Scoreboard ");
		if (numOfEntries == 0) {
			System.out.println("No entry in Scoreboard ");
		}
		for (int i = 0; i < numOfEntries; i++) {
			System.out.println((i + 1) + ". " + board[i]);
		}
	}

}
