package my.orange.graphElement;

import java.util.ArrayList;

public class Path {

	private ArrayList<City>path;
	private Integer totalCost;
	
	public ArrayList<City> getPath() {
		return path;
	}

	public void setPath(ArrayList<City> path) {
		this.path = path;
	}

	public Integer getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Integer totalCost) {
		this.totalCost = totalCost;
	}
	
	
}
