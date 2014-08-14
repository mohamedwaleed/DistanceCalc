package Testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import my.orange.FileHandler.ReadingFromFile;

import org.junit.Test;

public class FileReaderTest {

	ReadingFromFile readFile = new ReadingFromFile(
			"/home/sngv/GitHubProject/DistanceCalc/test.in");

	@Test
	public void readBuilder() {
		ArrayList<String> testingArrayList = new ArrayList<String>();
		testingArrayList.add("testing");
		assertEquals("Failed on loading Builder", readFile.readMapBlock(),
				testingArrayList);
	}

	@Test
	public void readQuery() {
		ArrayList<String> testingArrayList = new ArrayList<String>();
		testingArrayList.add("testing");
		assertEquals("Failed on loading Query", readFile.readQueryBlock(),
				testingArrayList);
	}
}
