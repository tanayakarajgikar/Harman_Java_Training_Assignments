package a;

public class Assignment3Q5sol {

	public static void main(String[] args) {

		UserRegistration registration=new UserRegistration();
		
		try {
			registration.registerUser("tanaya", "Insia");
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}
}
