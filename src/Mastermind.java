import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
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
		
		//System.out.println(solution);
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
	
	private static boolean patternsMatch(ArrayList<Peg> solution, ArrayList<Peg> guess){
		
		ArrayList<Boolean> reds = new ArrayList<Boolean>();
		ArrayList<Boolean> whites = new ArrayList<Boolean>();
		
		for(int k = 0; k < PATTERN_LENGTH; k++){
			if(solution.get(k).equals(guess.get(k))){
				System.out.print("r");
				reds.add(true);
			}else{
				reds.add(false);
			}
		}
		
		for(int k = 0; k < PATTERN_LENGTH; k++){
			if(reds.get(k) == false){
				for(int j = 0; j < PATTERN_LENGTH; j++){
					if(reds.get(j) == false && (whites.size() <= j || whites.get(j) == false)){
						if(solution.get(j).equals(guess.get(k))){
							System.out.print("w");
							whites.add(true);
							break;
						}else{
							whites.add(false);
						}
					}
				}
			}
		}
		System.out.println();
		return solution.equals(guess);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Mastermind!\nThere are 4 pegs and 6 possible colors (white, yellow, red, green, orange, blue).\nMake your guess with the first letter of the color (ex. 'RGBY' for red green blue yellow).");
		int x = 0;
		ArrayList<Peg> solution = generateSolution();
		ArrayList<Peg> guess;
		do {
			guess = getUserGuess();
			x++;
		} while(!patternsMatch(solution, guess));
		
		System.out.println("You win!");
		if(x == 1){
			System.out.println("It took you 1 try.");
		}else{
			System.out.println("It took you " + x + " tries.");
		}
	}

}
