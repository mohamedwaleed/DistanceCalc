package Testing;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import my.orange.FileHandler.IReader;
import my.orange.FileHandler.IWriter;
import my.orange.FileHandler.WritingOnFile;

import org.junit.Test;

public class WritingOnFileTest {

	private ArrayList<String> testWriting(String Filepath) throws IOException {
		@SuppressWarnings("resource")
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				Filepath));

		String line = "tst";
		ArrayList<String> result = new ArrayList<String>();

		while ((line = bufferedReader.readLine()) != null) {
			result.add(line);
		}
		return result;
	}

	@Test
	public void test() throws IOException {
		String path = "/home/sngv/GitHubProject/DistanceCalc/test.in";
		String pathreal = "/home/sngv/GitHubProject/DistanceCalc/ahmed.in";
		ArrayList<String> testing = testWriting(path);
		IWriter write = new WritingOnFile();
		write.write(pathreal, "ahmed");
		ArrayList<String> AnotherTest = testWriting(pathreal);
		assertEquals("not the Same -_- ", testing, AnotherTest);
	}
}
