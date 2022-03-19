package a;

public class UserRegistration {
	
	public void registerUser(String username,String userCountry)
			throws InvalidCountryException {
		if(userCountry.equals("india")) {
			System.out.println("user registration successful");
		}else
			throw new InvalidCountryException("invalid country name : "+
		userCountry+" please provide india");
	}
}
