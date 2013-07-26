package test.graph;

public class GraphNode {
	public long id;
	public String description;
	public GraphNode(long id, String description)
	{
		this.id = id;
		this.description = description;
	}
	
	public String toString()
	{
		return description;
	}
}
