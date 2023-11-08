package structural.adapter;

public class ValidationEmail implements AdapterEmail {

	@Override
	
	public Boolean isEmail(String email) {
		
		return LibValidationEmail.isEmail(email);
		
	}

}
