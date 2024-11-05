// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		int initalAmount = Integer.parseInt(args[0]);
		double interestRate = Double.parseDouble(args[1]);
		int numOfYears = Integer.parseInt(args[2]);

		int futureValue;
		futureValue = (int) (initalAmount * Math.pow(1 + (interestRate / 100), numOfYears));

		System.out.printf("After %s years, a $%d saved at %.1f%% will yield $%d",
				numOfYears, initalAmount, interestRate, futureValue);
	}
}