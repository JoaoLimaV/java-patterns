package creational.prototype;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.document = 1234567L;
		s1.name = "John";
		System.out.println(s1);
		
		Student s2 = ( Student ) s1.copy();
		s2.document = 88956691L;
		s2.name = "Ricardão do Bananão";
		System.out.println(s2);
	}

}
