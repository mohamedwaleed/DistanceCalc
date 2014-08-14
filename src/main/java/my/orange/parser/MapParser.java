package my.orange.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapParser implements IParser {

	public HashMap<String, ArrayList<String>> parse(String query) {
		// TODO Auto-generated method stub
		String regex = "(\\S+) (\\S+) (\\S+)";
		//

		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

		if (query.matches(regex)) {
			String[] tmpParam = query.split(" ");
			ArrayList<String> param = new ArrayList<String>();
			for (int i = 0; i < tmpParam.length; i++) {
				param.add(tmpParam[i]);
			}
			map.put("Graph", param);
		}
		return map;
	}

}
