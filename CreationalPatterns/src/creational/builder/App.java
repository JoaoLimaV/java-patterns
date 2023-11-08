package creational.builder;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Profession profession = new Profession();
		String name ="Peter";
		HairType hairType = new HairType();
		HairColor hairColor = new HairColor();
		Armor armor = new Armor();
		Weapon weapon = new Weapon();
		
		
		Hero heroDefault = new Hero(profession, name, hairType, hairColor, armor, weapon);
		
		// Using Builder
		
		Hero heroBuilder = new HeroBuilder()
			 .withProfession(profession)
			 .withName(name)
			 .build();
		
		System.out.println(heroDefault);
		System.out.println(heroBuilder);
		
	}

}
