package structural.composite;

public class Department {
	Integer id;
	String name;

	
	public Department(String name){
		this.name = name;
		this.id = (int) Math.round(Math.random() * 10);
	}
	
	public void print(){
		System.out.printf("[%d] [%s] \n", this.id, this.name);
	}
	
		
}
