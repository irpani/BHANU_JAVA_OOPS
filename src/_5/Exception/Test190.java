package _5.Exception;

import java.io.IOException;

public class Test190 {

	public static void main(String[] args) {
		try {
			TestExample19.test1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
