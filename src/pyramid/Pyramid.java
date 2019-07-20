package pyramid;

import java.util.ArrayList;
import java.util.Arrays;

public class Pyramid {

	public static void main(String[] args) {
		int lines = 15;

		if (lines < 1 || lines > 15) {
			System.out.println("Invalid number of lines");
		} else {

			ArrayList<Integer> list = new ArrayList<>(Arrays.asList(15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1,
					2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

			for (int i = 1; i <= lines; i++) {
				for (int j = 0; j < i; j++) {
				}
			}

		}
	}

}
