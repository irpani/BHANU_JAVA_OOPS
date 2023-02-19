package Final;

public class Example9 {

	int cube(int n) {
		n = n + 2;
		return n * n * n;
	}
	// int cube(final int n) {
	// n = n + 2;
	// return n * n * n;
	// }

	public static void main(String args[]) {
		Example9 b = new Example9();
		System.out.println(b.cube(5));
	}
}
