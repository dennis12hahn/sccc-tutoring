package quadratic;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		double[] eqn = new double[3];
		double[] roots = new double[2];

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the values for a, b, and c: ");

		for (int i = 0; i < eqn.length; i++) {
			eqn[i] = in.nextDouble();
		}

		int numOfRealRoots = solveQuadratic(eqn, roots);
		System.out.println("Number of real roots: " + numOfRealRoots);

		if (!Double.isNaN(roots[0])) {
			System.out.println(roots[0]);
		}

		if (!Double.isNaN(roots[1])) {
			System.out.println(roots[1]);
		}
	}

	private static int solveQuadratic(double[] eqn, double[] roots) {

		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];

		double discriminant = b * b - 4 * a * c;

		roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
		roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);

		if (discriminant < 0) {
			return 0;
		} else if (discriminant == 0) {
			return 1;
		} else {
			return 2;
		}

	}
}
