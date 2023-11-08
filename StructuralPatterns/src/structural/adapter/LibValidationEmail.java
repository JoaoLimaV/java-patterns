package structural.adapter;

public class LibValidationEmail {
	public static Boolean isEmail(String email) {
		
		System.out.println(email);
		return email.contains("@");

	}
}
