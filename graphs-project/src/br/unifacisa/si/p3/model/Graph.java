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

	public Graph() {
		this.nodes = new ArrayList<Node>();
		this.edges = new ArrayList<Edge>();
	}

	/**
	 * @author Andrews
	 * @param nodes
	 */
	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}

	/**
	 * @author Andrews
	 * @param edges
	 */
	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	/**
	 * @author Andrews
	 * @return nodes
	 */
	public List<Node> getNodes() {
		return nodes;
	}

	/**
	 * @author Andrews
	 * @return edges
	 */
	public List<Edge> getEdges() {
		return edges;
	}

	/**
	 * @author Andrews
	 * @param index
	 * @return distance
	 */
	public double getEdgeDistance(int index) {
		return edges.get(index).getDistance();
	}

	/**
	 * @author Andrews
	 * @param index
	 * @return name
	 */
	public String getNodeIndex(int index) {
		return nodes.get(index).getName();
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
