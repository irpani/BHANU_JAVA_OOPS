package _14.Interview_Programs;

public class PatternProgram8 {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
