package my.orange.algorithm;

import my.orange.builder.IGraphBuilder;
import my.orange.query.IQuery;

public interface IAlgorithm {
	boolean runAlgorithm(IGraphBuilder Graph, IQuery query);
}
