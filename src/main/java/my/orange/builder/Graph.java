package my.orange.builder;

import java.util.ArrayList;
import java.util.HashMap;

import my.orange.graphElement.City;
import my.orange.query.IQuery;
import my.orange.query.QueryGraph;

public class Graph implements IGraphBuilder {
	public HashMap<City, ArrayList<Pair>> graph = new HashMap<City, ArrayList<Pair>>();

	public void add(IQuery query) {
		City city1 = ((QueryGraph) query).getCityfrom();
		City city2 = ((QueryGraph) query).getCitys().get(0);
		int distance = ((QueryGraph) query).getDistance();
		Pair pair = new Pair(city2, distance);
		if (graph.containsKey(city1)) {
			graph.get(city1).add(pair);
		} else {
			ArrayList<Pair> tmpArrayList = new ArrayList<Pair>();
			tmpArrayList.add(pair);
			graph.put(city1, tmpArrayList);
		}

	}

	public ArrayList<Pair> getCityArray(City Key) {
		return graph.get(Key);
	}

	public Pair getPairIndex(City Key, int indx) {
		return graph.get(Key).get(indx);
	}

}
