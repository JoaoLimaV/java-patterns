package behavioural.strategy;

import java.io.File;

public interface Strategy {
	/**
	 * Reads input file and creates a new file in output path 
	 * @param input File in JPG format to be converted in another format (depending on strategy)
	 * @param output Path to output File
	 * @return Converted file selected format
	 */
	public File convert(File input, String output);

}
