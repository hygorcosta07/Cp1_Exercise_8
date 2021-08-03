/*
 * Student Name: Stanley Pieda (Professor)
 * Lab Professor: Stanley Pieda (Professor)
 * Due Date: The due date
 * Description: Sample Solution Exercise 08 (21S) Version 3
 */

/*
 * Simple driver program, it instantiates an EggCounter, then
 * calls methods enterEggs() and printReport() in sequence.
 */
public class Exercise08 {
	
	/*
	 * Entry point for the application, command line arguments are not
	 * used for this program.
	 */
	public static void main(String[] args) {
		System.out.println("Exercise 08 (21S) Version 3");
		EggCounter counter = new EggCounter();
		counter.enterEggs();
		counter.printReport();
		System.out.println("Program by Stanley Pieda");
	}
}