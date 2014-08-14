package my.orange.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryParser implements IParser {

	final String[] regex = {
			"what is the shortest path between (\\S+) to (\\S+)?",
			"What is the Cost of Path (\\S+)",
			"Give me route between (\\S+) to (\\S+)?",
			"What are the reachable cities from (\\S+) using (\\S+) Edges at Most?",
			"What are the reachable cities from (\\S+) using (\\S+) Edges at Minimum?",
			"What is the answer of Query (\\S+)?" };

	public HashMap<String, ArrayList<String>> parse(String query) {
		// TODO Auto-generated method stub
		HashMap<String, ArrayList<String>> map = null;
		ArrayList<String> param;

		for (int i = 0; i < regex.length; i++) {
			Pattern pattern = Pattern.compile(regex[i]);
			Matcher matcher = pattern.matcher(query);


			if (matcher.find()) {
				map = new HashMap<String, ArrayList<String>>();
				param = new ArrayList<String>();
				if (i == 0 || i == 2) {

					String from = matcher.group(1);
					String to = matcher.group(2);
					param.add(from);
					param.add(to);
					map.put("Dijkestra", param);

				} else if (i == 1) {

					String path = matcher.group(1);

					String[] arr = path.split(" ");

					for (int j = 0; j < arr.length; j++) {
						param.add(arr[j]);
					}
					map.put("PathCost", param);

				} else if (i == 3 || i == 4) {
					String from = matcher.group(1);
					String level = matcher.group(2);
					param.add(from);
					param.add(level);
					map.put("Bfs", param);

				} else if (i == 5) {
					String queryNumber = matcher.group(1);
					param.add(queryNumber);
					map.put("QueryNumber", param);
				}

				break;
			}
		}
		return map;
	}
}
