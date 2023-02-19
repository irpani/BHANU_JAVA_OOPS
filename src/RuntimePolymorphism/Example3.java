package RuntimePolymorphism;

public class Example3 {

	float getRateOfInterest() {
		return 0;
	}
}

class SBI extends Example3 {
	float getRateOfInterest() {
		return 7.4f;
	}
}

class ICICI extends Example3 {
	float getRateOfInterest() {
		return 7.3f;
	}
}