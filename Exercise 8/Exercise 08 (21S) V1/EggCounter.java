/*
 * Student Name: Stanley Pieda (Professor)
 * Lab Professor: Stanley Pieda (Professor)
 * Due Date: The due date
 * Description: Sample Solution Exercise 08 (21S) Version 1
 */
import java.util.Scanner;

/*
 * A class for counting egg sizes by way of weight entries.
 */
public class EggCounter {
	private static final int SIZE = 8;
	private int[] eggCounts = new int[SIZE];
	private String[] eggSizeNames = {"too small", "peewee", "small", "medium", 
            "large", "extra-large", "jumbo", "too large"};
	
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
	 */
	public void printReport() {
		int index = 0;
		while(index < SIZE) {
			System.out.printf("%s: %d%n", eggSizeNames[index], eggCounts[index]);
			index++;
		} // end while
	} // return
	
	/*
	 * Decides the egg size based on weight and returns a value to represent
	 *  this. The number returned is suitable as an array index.
	 */
	private int sizeEgg(double weight) {
		int size;
		if (weight < 15) {
			size = 0; // too small
		}
		else if (weight < 18) {
			size = 1; // peewee
		}
		else if (weight < 21) {
			size = 2; // small
		}	
		else if (weight < 24) {
			size = 3; // medium
		}
		else if (weight < 27) {
			size = 4; // large
		}
		else if (weight < 30) {
			size = 5; // extra-large
		}
		else if (weight < 33) {
			size = 6; // jumbo
		}
		else {
			size = 7; // too large
		}
		return size;
	}
}
