package count;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();
		String[] strs = str.split(" ");
		int[] nums = new int[strs.length];
		int[] occurs = new int[100];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(strs[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			occurs[nums[i]]++;
		}

		for (int i = 0; i < occurs.length; i++) {
			System.out.println(occurs[i]);
		}
	}
}

