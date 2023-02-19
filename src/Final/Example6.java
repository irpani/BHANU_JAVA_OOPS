package Final;

public class Example6 {

	int id;
	String name;
	String PAN_CARD_NUMBER = "123";

	public Example6(String panNumber) {
		this.PAN_CARD_NUMBER = panNumber;
		// Once the Instance Variable is Finalized when I try to assign.
		// Local variable to Instanace Variable Throws Error Message.
	}
}
