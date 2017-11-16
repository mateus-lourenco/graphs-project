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
	public Edge addEdge(Node start, Node end) {
		Edge edge = new Edge(start, end);
		start.addEdge(edge);
		edges.add(edge);
		return edge;
	}
}
