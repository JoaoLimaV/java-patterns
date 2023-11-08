package behavioural.iterator;

import java.io.File;
import java.util.HashMap;

public class App {
	public static void main(String[] args) {
		GetFile get = new GetFile("C:\\Users\\Lima\\Downloads");
		
		Iterator <File> iterator = get.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
