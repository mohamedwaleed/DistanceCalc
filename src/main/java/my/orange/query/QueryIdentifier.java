package my.orange.query;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class QueryIdentifier implements IQuery {

	String Type;
	private IQuery queryType;

	public IQuery GenerateQuery(HashMap<String, ArrayList<String>> data,
			int distance) {

		// return the key of HashMap
		Type = data.entrySet().iterator().next().getKey();

		try {
			Class c = Class.forName(Type);
			queryType = (IQuery) c.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return queryType;

	}
}
