package _5.Exception;

import java.io.BufferedReader;

public class Example6 {

	public static void main(String[] args) {

		BufferedReader rd = null;
		try {
			// rd = new BufferedReader(new FileReader(new File("")));
			// rd.readLine();
			int i = 9 / 0;
		} catch (Exception e) {
			System.out.println("---");
		}

		finally {
			System.out.println("000");
		}
	}

	// try {
	// rd.readLine();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
}
