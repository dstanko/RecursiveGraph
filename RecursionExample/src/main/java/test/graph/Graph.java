package test.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph {
	public List<NodeConnector> connectors;
	
	public Set<GraphNode> getChildren(GraphNode node)
	{
		Set<GraphNode> localConnect = new HashSet<GraphNode>();
		for (NodeConnector connect : connectors)
		{
			if (connect.fromNode.equals(node))
			{
				localConnect.add(connect.toNode);
			}
		}
		return localConnect;
	}
	
	public Set<GraphNode> getAllDecendents(GraphNode node, Set<GraphNode> localConnect)
	{
		for (NodeConnector connect : connectors)
		{
			if (connect.fromNode.equals(node))
			{
				localConnect.add(connect.toNode);
				getAllDecendents(connect.toNode, localConnect);
			}
		}
		return localConnect;
	}

	public Set<GraphNode> getLeaves(GraphNode node, Set<GraphNode> localConnect)
	{
		boolean nodeFound = false;
		for (NodeConnector connect : connectors)
		{
			if (connect.fromNode.equals(node))
			{
				nodeFound = true;
				getLeaves(connect.toNode, localConnect);
			}
		}
		if (!nodeFound)
		{
			localConnect.add(node);
		}
		return localConnect;
	}

}
