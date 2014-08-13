package my.orange.context;

import java.util.HashMap;

import my.orange.algorithm.IAlgorithm;

public class GraphContext {

	private IAlgorithm algorithm;
	private String result;
	private HashMap<String, IAlgorithm> algorithmObjects = new HashMap<String, IAlgorithm>();

	public GraphContext(String filePath) {
		// Initialize hashmap with all sub types of algorithms
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

}
