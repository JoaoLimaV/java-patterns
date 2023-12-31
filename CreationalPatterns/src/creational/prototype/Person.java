package creational.prototype;

public class Person extends Prototype<Person> implements Cloneable{
	String name;
	long document;
	
	@Override
	public String toString() {
		return String.format("Person=(name %s, document: %d)", name, document);
	}
}
