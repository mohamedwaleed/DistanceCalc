package my.orange.query;

import java.util.ArrayList;
import java.util.HashMap;

import my.orange.graphElement.City;

public class QueryGraph implements IQuery {
	private ArrayList<City> city = new ArrayList<City>();
	private int distance;
	private String cityfrom;

	@Override
	public void setValue(HashMap<String, ArrayList<String>> arrayList) {
		setCityfrom(arrayList.entrySet().iterator().next().getKey());
		if (arrayList.get(getCityfrom()).size() == 2) {
			String to = arrayList.get(getCityfrom()).get(0);
			setDistance(Integer.parseInt(arrayList.get(getCityfrom()).get(1)));
			getCity().add(new City(to));
		} else {
			String path = arrayList.get(getCityfrom()).get(0);
			String to = arrayList.get(getCityfrom()).get(1);
			setDistance(Integer.parseInt(arrayList.get(getCityfrom()).get(2)));
			getCity().add(new City(path));
			getCity().add(new City(to));
		}

	}

	@Override
	public IQuery getIQuery() {
		return this;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public ArrayList<City> getCity() {
		return city;
	}

	public void setCity(ArrayList<City> city) {
		this.city = city;
	}

	public String getCityfrom() {
		return cityfrom;
	}

	public void setCityfrom(String cityfrom) {
		this.cityfrom = cityfrom;
	}

}
