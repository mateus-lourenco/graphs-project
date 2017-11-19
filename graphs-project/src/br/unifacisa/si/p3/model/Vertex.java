package br.unifacisa.si.p3.model;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author Mateus Lourenco
 *
 */
public class Vertex {
	private String name;
	List<Edge> connections;

	/**
	 * 
	 * @param name
	 */
	public Vertex(String name) {
		this.name = name;
		this.connections = new LinkedList<Edge>();
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param edge
	 */
	public void addConnection(Edge edge) {
		connections.add(edge);
	}

	/**
	 * @return the connections
	 */
	public Edge getConnectionByIndex(int index) {
		return connections.get(index);
	}

}
