package my.orange.builder;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph implements IGraphBuilder {
	HashMap<String, ArrayList<Pair>> graph = new HashMap<String, ArrayList<Pair>>();
	String Key;

	public String getCityName() {
		return graph.entrySet().iterator().next().getKey();
	}

	public ArrayList<Pair> getCityArray() {
		return graph.get(Key);
	}

	public Pair getPairIndex(int indx) {
		return graph.get(Key).get(indx);
	}

}
