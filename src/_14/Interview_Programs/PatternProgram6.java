package _14.Interview_Programs;

import java.util.Scanner;

public class PatternProgram6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter input data");
		int number = scanner.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = number; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
