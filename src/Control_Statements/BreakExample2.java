package Control_Statements;

public class BreakExample2 {

	public static void main(String[] args) {
		int array[] = { 120, 230, 404, 560, 708 };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println(array[j]);
				if (array[j] == 560) {
					break;
				}
			}
		}
	}
}
