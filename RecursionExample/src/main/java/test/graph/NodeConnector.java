package test.graph;

public class NodeConnector {
	public long id;
	public GraphNode fromNode;
	public GraphNode toNode;
	
	public NodeConnector(long id, GraphNode from, GraphNode to)
	{
		this.id = id;
		this.fromNode = from;
		this.toNode = to;
	}
}
