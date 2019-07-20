package tax_table;

public class Tax {

	public static void main(String[] args) {
		printHeader();
		double start = 50000;
		double end = 60000;
		double interval = 50;

		for (double i = start; i < end; i += interval) {
			double single = computeTax(0, i);
			double marriedJoint = computeTax(1, i);
			double married = computeTax(2, i);
			double headOfHousehold = computeTax(3, i);
		}
	}

	private static double computeTax(int i, double i2) {
		return 0;
	}

	private static void printHeader() {
		System.out.print("Taxable");
		printTabs(2);
		System.out.print("Single");
		printTabs(2);
		System.out.print("Married Joint");
		printTabs(2);
		System.out.print("Married");
		printTabs(2);
		System.out.print("Head of");
		printNewLine();
		System.out.print("Income");
		printTabs(4);
		System.out.print("or Qualifying");
		printTabs(2);
		System.out.print("Separate");
		printTabs(1);
		System.out.print("a House");
		printNewLine();
		printTabs(4);
		System.out.print("Widow(er)");
		printNewLine();
		printSeparator();
	}

	private static void printSeparator() {
		System.out.println("---------------------------------------------------------------------------------------");
	}

	private static void printTabs(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print('\t');
		}
	}

	private static void printNewLine() {
		System.out.print('\n');
	}
}