// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
		String name3 = args[0];
		String name2 = args[1];
		String name1 = args[2];
		int cost = Integer.parseInt(args[3]);

		double splitCost = Math.ceil((double) cost / 3);

		String output = String.format("Dear %s, %s, and %s: pay ", name1, name2, name3);
		output += splitCost;
		output += " Shekels each";

		System.out.println(output);
	}
}
