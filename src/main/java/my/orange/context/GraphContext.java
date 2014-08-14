package my.orange.context;

import java.util.ArrayList;
import java.util.HashMap;

import my.orange.algorithm.IAlgorithm;
import my.orange.builder.Graph;
import my.orange.builder.IGraphBuilder;
import my.orange.query.QueryGraph;
import my.orange.query.IQuery;

public class GraphContext {

	private IAlgorithm algorithm;
	private String result;
	private HashMap<String, IAlgorithm> algorithmObjects = new HashMap<String, IAlgorithm>();
	private IGraphBuilder graphBuilder;

	public GraphContext() {
		graphBuilder = new Graph();
	}

	public void setAlgorithm(IAlgorithm algorithm) {
		this.algorithm = algorithm;
	}

	public String getResult() {
		return result;
	}

	public void initliazeGraphBuilder(IQuery QueryMap) {
		graphBuilder.add(QueryMap);
	}

	public String resultOfAlogorithm(IQuery graphQuery) {
		return "";
	}
}
