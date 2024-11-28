package dataStructureAlgorithmProject.chapter_1;

/*R-1.2 Suppose that we create an array A of GameEntry objects, which has an integer
scores field, and we clone A and store the result in an array B. If we then immediately
set A[4].score equal to 550, what is the score value of the GameEntry
object referenced by B[4]?
*/
public class GameEntry {

	int score;

	public GameEntry(int scoreVal) {
		this.score = scoreVal;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		GameEntry[] A = { new GameEntry(100), new GameEntry(200), new GameEntry(300), new GameEntry(400),
				new GameEntry(500) };
		GameEntry[] B = A.clone();
		A[4].score = 550;

		System.out.println("Score of B[4] : " + B[4].score);
	}
}
/*
 * Explanation Output: Score of B[4]: 550 Reason: Both A[4] and B[4] refer to
 * the same GameEntry object, so a change in A[4].score is reflected in
 * B[4].score.
 */