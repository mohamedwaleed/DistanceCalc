package my.orange.parser;

import java.util.ArrayList;
import java.util.HashMap;

public interface IParser {
	HashMap<String, ArrayList<String>> parse(String query);
}
