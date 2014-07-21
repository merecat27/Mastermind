import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;


public class Mastermind {
	
	private final static int PATTERN_LENGTH = 4;
	
	private static ArrayList<Peg> generateSolution() {
		ArrayList<Peg> solution = new ArrayList<Peg>(PATTERN_LENGTH);
		
		Random random1 = new Random();
		
		for(int i = 0; i < PATTERN_LENGTH; i++){
			int rand = random1.nextInt(6);
			
			if(rand == 0){
				solution.add(new Peg(Color.white));
			}else if(rand == 1){
				solution.add(new Peg(Color.orange));
			}else if(rand == 2){
				solution.add(new Peg(Color.red));
			}else if(rand == 3){
				solution.add(new Peg(Color.green));
			}else if(rand == 4){
				solution.add(new Peg(Color.yellow));
			}else if(rand == 5){
				solution.add(new Peg(Color.blue));
			}
		}
		
		return solution;
	}
	
	private static ArrayList<Peg> getUserGuess() {
		ArrayList<Peg> guess = new ArrayList<Peg>(PATTERN_LENGTH);
		//TODO: get user's guess, store in guess
		
		return guess;
	}
	
	private static boolean patternsMatch(ArrayList<Peg> first,
			ArrayList<Peg> second) {
		//TODO: print w or r depending on match.
		//TODO: if patterns are same, return true.
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Mastermind!");
		
		ArrayList<Peg> solution = generateSolution();
		ArrayList<Peg> guess;
		do {
			guess = getUserGuess();
		} while(!patternsMatch(solution, guess));
		
		System.out.println("Game Over!");
	}

}
