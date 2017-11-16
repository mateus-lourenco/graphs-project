package br.unifacisa.si.p3.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Mateus Lourenco
 *
 */
public class Node {
	String name;
	List<Edge> connection;

	/**
	 * 
	 * @param name
	 */
	public Node(String name) {
		this.name = name;
		this.connection = new ArrayList<Edge>();
	}

	/**
	 * 
	 * @param edge
	 */
	public void addEdge(Edge edge) {
		connection.add(edge);
	}
}
