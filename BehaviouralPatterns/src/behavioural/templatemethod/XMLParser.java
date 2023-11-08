package behavioural.templatemethod;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLParser extends DataParser {

	@Override
	protected List<String> readData() {
		// TODO Auto-generated method stub
		List<String> data = new ArrayList<>();
		File f = new File(path);
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			String line = null;
			while ( (line = reader.readLine()) != null) {
				data.add(line);
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
		
	}

	@Override
	protected void writeData(List<String> data) {
		// TODO Auto-generated method stub
	
		try {
			File f = new File(path);
			BufferedWriter writer;
			writer = new BufferedWriter(new FileWriter(f));
			
			data.forEach(e -> {
				try {
					writer.write(e);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			});
			writer.close();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}
}
