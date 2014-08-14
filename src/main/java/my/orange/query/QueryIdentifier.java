package my.orange.query;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.RowFilter.Entry;
import javax.swing.text.html.HTMLDocument.Iterator;

public abstract class QueryIdentifier {

	String Type;
	private IQuery queryType;

	public IQuery GenerateQuery(HashMap<String, ArrayList<String>> data) {

		String type;

		type = data.entrySet().iterator().next().getKey();
		Class c;
		try {
			c = Class.forName(type);
			queryType = (IQuery) c.newInstance();
			queryType.setValue(data);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return queryType;
	}
}
