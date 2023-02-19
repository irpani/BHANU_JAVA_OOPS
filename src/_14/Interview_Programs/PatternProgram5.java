package _14.Interview_Programs;

import java.util.Scanner;

public class PatternProgram5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter input data");
		int number = scanner.nextInt();
		for (int i = number; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
