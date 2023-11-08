package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundDepartment extends Department {
	private List<Department> childern = new ArrayList<Department>();
	
	public CompoundDepartment(String name){
		super(name);
	}
	
	public void add(Department department) {
		childern.add(department);
	}
	public void remove(Department department) {
		childern.remove(department);
	}
	
	@Override
	public void print() {
		childern.forEach(Department::print);
	}
}
