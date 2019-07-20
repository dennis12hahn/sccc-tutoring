package trig_functions;

public class Demo {

	private final static int HEIGHT = 20;
	private final static int LENGTH = 200;

	public static void main(String[] args) {
		printTrig("cot");
	}

	private static void printTrig(String choice) {
		for (int i = HEIGHT; i > -HEIGHT; i--) {
			for (double j = 0; j <= LENGTH; j++) {

				double x = (j / LENGTH) * (2 * Math.PI);

				int y = 0;

				switch (choice) {
					case "sin":
						y = (int) (Math.sin(x) * HEIGHT);
						break;
					case "cos":
						y = (int) (Math.cos(x) * HEIGHT);
						break;
					case "tan":
						y = (int) (Math.tan(x) * HEIGHT);
						break;
					case "arcsin":
						y = (int) (Math.asin(x) * HEIGHT);
						break;
					case "arccos":
						y = (int) (Math.acos(x) * HEIGHT);
						break;
					case "arctan":
						y = (int) (Math.atan(x) * HEIGHT);
						break;
					case "cot":
						y = (int) ((1 / Math.tan(x)) * HEIGHT);
						break;
				}

				if (y == i) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
