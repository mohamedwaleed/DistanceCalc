package my.orange.FileHandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WritingOnFile implements IWriter {

	private PrintWriter writer;

	public boolean write(String filePath, String result) {

		try {
			writer = new PrintWriter(filePath, "UTF-8");
			writer.println(result);
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return false;
	}

}
