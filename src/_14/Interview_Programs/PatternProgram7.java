package _14.Interview_Programs;

public class PatternProgram7 {

	public static void main(String[] args) {
		for (int i = 7; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int k = 2; k <= 7; k++) {
			for (int j = 1; j <= k; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}