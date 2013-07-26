package test.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import org.junit.Test;

public class GraphTest extends TestCase 
{
	@Test
	public void testThis()
	{
		GraphNode node = new GraphNode(1, "Shirt");
		GraphNode node1 = new GraphNode(1, "Shirt1");
		GraphNode node2 = new GraphNode(1, "Shirt2");
		GraphNode node3 = new GraphNode(1, "Shirt3");
		GraphNode node4 = new GraphNode(1, "Shirt4");
		GraphNode node5 = new GraphNode(1, "Shirt5");
		GraphNode node6 = new GraphNode(1, "Shirt6");
		GraphNode node7 = new GraphNode(1, "Shirt7");
		GraphNode node8 = new GraphNode(1, "Shirt8");
		
		List<NodeConnector> connectors = new ArrayList<NodeConnector>();
		NodeConnector con = new NodeConnector(1, node, node1);
		NodeConnector con1 = new NodeConnector(1, node, node2);
		NodeConnector con2 = new NodeConnector(1, node1, node3);
		NodeConnector con3 = new NodeConnector(1, node1, node4);
		NodeConnector con4 = new NodeConnector(1, node1, node5);
		NodeConnector con5 = new NodeConnector(1, node2, node6);
		NodeConnector con6 = new NodeConnector(1, node6, node7);
		NodeConnector con7 = new NodeConnector(1, node6, node8);
		
		connectors.add(con);
		connectors.add(con1);
		connectors.add(con2);
		connectors.add(con3);
		connectors.add(con4);
		connectors.add(con5);
		connectors.add(con6);
		connectors.add(con7);
		
		Graph graph = new Graph();
		graph.connectors = connectors;
		
		Set<GraphNode> all = graph.getAllDecendents(node3, new HashSet<GraphNode>());
		Set<GraphNode> child  =graph.getChildren(node3);
		Set<GraphNode> leave =graph.getLeaves(node3, new HashSet<GraphNode>());
		
		System.out.println(all);
		System.out.println(child);
		System.out.println(leave);
		
		
	}
}
