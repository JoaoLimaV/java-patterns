package creational.builder;

public class Profession {
	
	private  String profession = "Soldier";
	
	@Override
	public String toString() {
		return new StringBuilder()
				   .append((this.profession != null ? this.profession : "Not Informed"))
				   .toString();
	}
}
