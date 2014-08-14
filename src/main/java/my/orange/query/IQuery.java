package my.orange.query;

import java.util.ArrayList;
import java.util.HashMap;

import my.orange.graphElement.City;

public interface IQuery {

	public void setValue(HashMap<String, ArrayList<String>> arrayList);

	IQuery getIQuery();
}
