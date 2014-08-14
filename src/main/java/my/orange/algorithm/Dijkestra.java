package my.orange.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

import my.orange.builder.Graph;
import my.orange.builder.IGraphBuilder;
import my.orange.builder.Pair;
import my.orange.query.IQuery;

public class Dijkestra implements IAlgorithm {

	public boolean runAlgorithm(IGraphBuilder Graph, IQuery query) {

		return false;
	}

	private int dijkestraImplementation(Graph graph,
			String from, String to) {

		Queue<Pair> queue = new PriorityQueue<Pair>();
		
		//
		// int dist[10002];
		//
		// memset(dist , 28 , sizeof(dist));
		// dist[start] = 0;
		// priority_queue <pair<int,int>, vector<pair<int,int> >,
		// greater<pair<int,int> > > q;
		// q.push(make_pair(0, start));// cost , city
		//
		// while (!q.empty()) {
		//
		// int d = q.top().first, u = q.top().second;
		// q.pop();
		// if (dist[u] == -1)
		// break;
		// if (u == end)
		// return dist[u];
		// for (int i = 0; i < (int) graph[u].size(); i++) {
		// int v = graph[u][i].first;
		// int new_dist = d + graph[u][i].second;
		//
		// if (new_dist < dist[v]) {
		// dist[v] = new_dist;
		// q.push(make_pair(new_dist , v));
		// }
		//
		// }
		//
		// }
		// return dist[end];
		//
		//
		return 0;

	}
}
