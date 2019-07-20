package grades;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] occurrences = new int[100];
		System.out.println("Enter numbers separated by spaces from 1 to 100: ");

		int num;

		while ((num = in.nextInt()) != 0) {
			occurrences[num]++;
		}

		for (int i = 0; i < occurrences.length; i++) {
			int occur = occurrences[i];

			if (occur == 0) {
				continue;
			}

			System.out.println(i + " occurs " + occur + (occur > 1 ? " times" : " time"));

		}

	}
}
