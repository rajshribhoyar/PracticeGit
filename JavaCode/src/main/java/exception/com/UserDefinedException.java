package exception.com;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String msg) {
		System.out.println(msg);

	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		try {
			vote(12);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void vote(int age) throws InvalidAgeException {

		if (age < 18) {
			throw new InvalidAgeException("Not eligible for Voting");

		} else {
			System.out.println("Eligible for Voting");
		}
	}
}