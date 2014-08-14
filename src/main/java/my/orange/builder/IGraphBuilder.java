package my.orange.builder;

import java.util.ArrayList;
import java.util.HashMap;

import my.orange.graphElement.City;
import my.orange.query.IQuery;
import my.orange.query.QueryGraph;

public interface IGraphBuilder {
	public void add(IQuery query);

	public ArrayList<Pair> getCityArray(City Key);

	public Pair getPairIndex(City Key, int indx);
}