package structural.adapter;

public class App {
	public static void main(String[] args) {
		ValidationEmail validationEmail = new ValidationEmail(); 
		String email = "joao@joao.com";
		System.out.println("Seu email é: " + validationEmail.isEmail(email) ); 
	}
}
