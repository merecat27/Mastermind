import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;


public class Mastermind {
	
	private final static int PATTERN_LENGTH = 4;
	
	private static ArrayList<Peg> generateSolution() {
		ArrayList<Peg> solution = new ArrayList<Peg>(PATTERN_LENGTH);
		//TODO: add four Pegs to solution
		
		return solution;
	}
	
	private static ArrayList<Peg> getUserGuess() {
		ArrayList<Peg> guess = new ArrayList<Peg>(PATTERN_LENGTH);
		//get user's guess, store in guess
		System.out.println("Guess: ");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		input = input.replace(" ", "").toLowerCase();
		input += "rrrr"; //defaults if too short.
		
		for (int i=0; i < PATTERN_LENGTH; i++) {
			Color color;
			switch (input.charAt(i)) {
			case 'r':
				color = Color.red;
				break;
			case 'w':
				color = Color.white;
				break;
			case 'b':
				color = Color.blue;
				break;
			case 'o':
				color = Color.orange;
				break;
			case 'g':
				color = Color.green;
				break;
			default:
				color = Color.yellow;
			}
			guess.add(new Peg(color));
		}
		return guess;
	}
	
	private static boolean patternsMatch(ArrayList<Peg> first,
			ArrayList<Peg> second) {
		//TODO: print w or r depending on match.
		//TODO: if patterns are same, return true.
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Mastermind!");
		
		ArrayList<Peg> solution = generateSolution();
		ArrayList<Peg> guess;
		do {
			guess = getUserGuess();
		} while(!patternsMatch(solution, guess));
		
		System.out.println("You win!");
	}

}
