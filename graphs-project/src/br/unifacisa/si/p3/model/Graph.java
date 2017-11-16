 package br.unifacisa.si.p3.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mateus Lourenco
 *
 */
public class Graph {
	List<Node> nodes;
	List<Edge> edges;

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	public List<Node> getNodes() {
		return nodes;
	}

	public List<Edge> getEdges() {
		return edges;
	}
	
	public double getEdgeDistance(int index) {
		return edges.get(index).getDistance();
	}
	
	public String getNodeIndex(int index) {
		return nodes.get(index).getName();
	}

	public Graph() {
		this.nodes = new ArrayList<Node>();
		this.edges = new ArrayList<Edge>();
	}

	/**
	 * 
	 * @param name
	 * @return value inserted
	 */
	public Node addNode(String name) {
		Node n = new Node(name);
		nodes.add(n);
		return n;
	}

	/**
	 * 
	 * @param start
	 * @param end
	 * @return value inserted
	 */
	public void addEdge(Node start, Node end, double distance) {
		Edge edge = new Edge(start, end, distance);
		start.addEdge(edge);
		edges.add(edge);
	}
}
