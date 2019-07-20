package number_game;

import java.util.Random;
import java.util.Scanner;

public class UserGuesses {

	public static void main(String[] args) {
		final Random random = new Random();
		final Scanner in = new Scanner(System.in);

		System.out.println("In this game you will enter a high number greater than zero.");
		System.out.println("Then you will think of a number between zero and that number.");
		System.out.println("I will guess this number, tell me if I am correct.");

		int low = 0;
		int high = 0;
		while (true) {
			System.out.println();
			System.out.println("Enter the high number: ");
			high = in.nextInt();

			if (high > low) {
				break;
			}
		}

		int upperBound = high;
		int lowerBound = low;
		while (true) {
			int guess = getMidpoint(lowerBound, upperBound);

			System.out.println("My guess is " + guess);
			System.out.println("Is my guess high, low, or correct? [1,2,3]");

			int result = in.nextInt();

			if (result == 1) {
				upperBound = guess;
			} else if (result == 2) {
				lowerBound = upperBound / 2;
			} else {
				break;
			}
		}
	}

	private static int getMidpoint(int lowerBound, int upperBound) {
		return (upperBound - lowerBound) / 2;
	}

}
