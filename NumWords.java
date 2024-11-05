// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);

		int hundreds, tens, units;
		hundreds = num / 100;
		tens = (num / 10) % 10;
		units = num % 10;

		System.out.printf("%d hundreds, %d tens, and %d ones.", hundreds, tens, units);
	}
}
