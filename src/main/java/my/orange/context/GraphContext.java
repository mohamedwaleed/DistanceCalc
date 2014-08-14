package my.orange.context;

import java.util.ArrayList;
import java.util.HashMap;

import my.orange.algorithm.IAlgorithm;
import my.orange.builder.IGraphBuilder;
import my.orange.query.IQuery;

public class GraphContext {

	private IAlgorithm algorithm;
	private String result;
	private HashMap<String, IAlgorithm> algorithmObjects = new HashMap<String, IAlgorithm>();
	private IGraphBuilder graphBuilder;

	public GraphContext() {
	}

	public void setAlgorithm(String algorithmType) {
		// return objects by reflection
	}

	public boolean executeAlgorithm() {
		return false;
	}

	public IAlgorithm getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(IAlgorithm algorithm) {
		this.algorithm = algorithm;
	}

	public String getResult() {
		return result;
	}

	public void initliazeGraphBuilder(IQuery QueryMap) {
		// intilaize graph on context
	}

	public String resultOfAlogorithm(IQuery graphQuery) {
		return "";
	}
}
