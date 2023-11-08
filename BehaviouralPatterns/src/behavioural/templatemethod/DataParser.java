package behavioural.templatemethod;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public abstract class DataParser {
	private List<String> data = new ArrayList<String>();
	protected String path;
	private static final Logger LOG = Logger.getLogger(DataParser.class.getName());
	
	// Esse é o método-template
	public final void sanitize() {
		LOG.info("Initializing process for saniting data...");
		
		data = readData();
		data = removeHtml(data);
		data = removeUnsafe(data);
		writeData(data);
		
		LOG.info("Sanitization complete.");
	}
	
	private List<String> removeHtml (List<String> data){
		return data.stream().map(DataParser::removeHtml).collect(Collectors.toList());	
	}
	
	private static String removeHtml(String d) {
		// </?\w+([\s|\n]+[\w|-]+=".+")*>?
		return d.replaceAll("</?\\w+([\\s|\\n]+[\\w|-]+=\".+\")*>?", "");
	}

	
	private List<String> removeUnsafe (List<String> data){
		return data.stream().map( e -> e.replaceAll("[&|\"|\\(|\\)\\\\|=]", "")).collect(Collectors.toList());		
	}
	
	protected abstract List<String> readData();
	protected abstract void writeData(List<String> data);

}
