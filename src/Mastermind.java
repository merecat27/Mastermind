import java.util.ArrayList;


public class Mastermind {
	
	private final static int PATTERN_LENGTH = 4;
	
	private static ArrayList<Peg> generateSolution() {
		ArrayList<Peg> solution = new ArrayList<Peg>(PATTERN_LENGTH);
		//TODO: add four Pegs to solution
		
		return solution;
	}
	
	private static ArrayList<Peg> getUserGuess() {
		ArrayList<Peg> guess = new ArrayList<Peg>(PATTERN_LENGTH);
		//TODO: get user's guess, store in guess
		
		return guess;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Mastermind!");
		
		ArrayList<Peg> solution = generateSolution();
		ArrayList<Peg> guess;
		do {
			guess = getUserGuess();
		} while(!patternsMatch(solution, guess));
		
		System.out.println("Game Over!");
	}

}
