/*
 * Student Name: Stanley Pieda (Professor)
 * Lab Professor: Stanley Pieda (Professor)
 * Due Date: The due date
 * Description: Sample Solution Exercise 08 (21S) Version 2
 */
import java.util.Scanner;

/*
 * A class for counting egg sizes by way of weight entries.
 * Updated Version 2: Added constants, modified method(s) to use them
 */
public class EggCounter {
	private static final int SIZE = 8;
	private int[] eggCounts = new int[SIZE];
	private String[] eggSizeNames = {"too small", "peewee", "small", "medium", 
            "large", "extra-large", "jumbo", "too large"};
	private static final int TOO_SMALL = 0;
	private static final int PEEWEE = 1;
	private static final int SMALL = 2;
	private static final int MEDIUM = 3;
	private static final int LARGE = 4;
	private static final int EXTRA_LARGE = 5;
	private static final int JUMBO = 6;
	private static final int TOO_LARGE = 7;
	
	/*
	 * Interacts with the user using a loop to obtain egg weights 
	 * one at a time, increments appropriate eggCounter array element. 
	 * Exits loop when a sentinel value is entered.
	 */
	public void enterEggs() {
		Scanner console = new Scanner(System.in);
		String shouldContinue;
		double weight;
		int size;
		
		do {
			System.out.print("Enter egg weight: ");
			weight = console.nextDouble();
			console.nextLine();
			size = sizeEgg(weight);
			eggCounts[size] = eggCounts[size] + 1;
			System.out.print("Enter another egg weight? (Y/N) ");
			shouldContinue = console.nextLine();
		} while (shouldContinue.equalsIgnoreCase("Y"));
	} // return

	/*
	 * Uses parallel arrays to print name of egg size, and count of occurrences
	 * Updated Version 2: for-loop replaced the while-loop
	 */
	public void printReport() {
		for(int index = 0; index < SIZE; index++) {
			System.out.printf("%s: %d%n", eggSizeNames[index], eggCounts[index]);
		} // end for
	} // return
	
	/*
	 * Decides the egg size based on weight and returns a value to represent
	 *  this. The number returned is suitable as an array index.
	 *  Updated Version 2: uses constants instead of magic numbers
	 */
	private int sizeEgg(double weight) {
		int size;
		if (weight < 15) {
			size = TOO_SMALL;
		}
		else if (weight < 18) {
			size = PEEWEE;
		}
		else if (weight < 21) {
			size = SMALL;
		}	
		else if (weight < 24) {
			size = MEDIUM;
		}
		else if (weight < 27) {
			size = LARGE;
		}
		else if (weight < 30) {
			size = EXTRA_LARGE;
		}
		else if (weight < 33) {
			size = JUMBO;
		}
		else {
			size = TOO_LARGE;
		}
		return size;
	}
}
