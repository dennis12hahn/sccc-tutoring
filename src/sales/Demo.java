package sales;

public class Demo {

	public static void main(String[] args) {
		double sales = 0;
		double commission = 0;

		while (true) {
			if (sales <= 5000.00) {
				commission = sales * 0.08;
			} else if (sales <= 10000.00) {
				commission = 5000.00 * 0.08 + (sales - 5000.00) * 0.10;
			} else {
				commission = 5000.00 * 0.08 + 5000.00 * 0.10 + (sales - 10000.00) * 0.12;
			}

			if (commission >= 25000.00) {
				break;
			} else {
				sales += 0.01;
			}
		}

		System.out.printf("%.2f", sales);
	}
}
