package my.orange.graphElement;

public class Edge {
	
	private City from;
	private City to;
	private Integer cost;
	public City getFrom() {
		return from;
	}
	public void setFrom(City from) {
		this.from = from;
	}
	public City getTo() {
		return to;
	}
	public void setTo(City to) {
		this.to = to;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	
}
