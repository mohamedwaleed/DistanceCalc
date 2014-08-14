package my.orange.FileHandler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingFromFile implements IReader {

	@SuppressWarnings("unused")
	private Integer mapPos;
	private Integer queryPos;
	private String fileName;
	private BufferedReader bufferedReader;

	public ReadingFromFile(String fileName) {
		this.fileName = fileName;
		mapPos = 0;
		queryPos = 1;
	}

	public ArrayList<String> readMapBlock() {

		ArrayList<String> result = new ArrayList<String>();

		try {

			bufferedReader = new BufferedReader(new FileReader(fileName));

			@SuppressWarnings("unused")
			int numberOfCity;
			int numberOfEdge;

			String numbers = bufferedReader.readLine();

			int indx = numbers.indexOf(' '); // index of char empty

			numberOfCity = Integer.parseInt(numbers.substring(0, indx));
			numberOfEdge = Integer.parseInt(numbers.substring(indx + 1,
					numbers.length()));

			// read the line of Graph Builder
			while (numberOfEdge != 0) {
				result.add(bufferedReader.readLine());
				numberOfEdge--;
				queryPos++;
			}

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}

	public ArrayList<String> readQueryBlock() {
		ArrayList<String> result = new ArrayList<String>();
		int counter = queryPos;
		try {

			bufferedReader = new BufferedReader(new FileReader(fileName));
			// reach to query postion
			while (bufferedReader.readLine() != null && counter != 0) {
				counter--;
			}

			int numberOfQuery = Integer.parseInt(bufferedReader.readLine());

			while (numberOfQuery != 0) {
				result.add(bufferedReader.readLine());
				numberOfQuery--;
			}

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
