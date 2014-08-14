package my.orange.parserTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import junit.framework.Assert;
import my.orange.parser.IParser;
import my.orange.parser.MapParser;
import my.orange.parser.QueryParser;

import org.junit.Test;

public class MapParserTest {

	@Test
	public void parseTestQuery() {
		
		IParser queryParser = new QueryParser();
		HashMap<String, ArrayList<String>> result = queryParser.parse("What is the answer of Query 70?");
		
		assertTrue(result!=null);
		
		assertEquals(1, result.get("QueryNumber").size());
		
	}
	@Test
	public void parseTestMap() {
		
		IParser mapParser = new MapParser();
		HashMap<String, ArrayList<String>> result = mapParser.parse("Giza Aswan 100");
		
		assertTrue(result!=null);
		
		assertEquals(3, result.get("Graph").size());
		
	}
}
