package br.unifacisa.si.p3.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Mateus Lourenco
 *
 */
public class Vertex {
	private String name;
	List<Edge> edges;

	/**
	 * @return the edges
	 */
	public Edge getConnection(int index) {
		return edges.get(index);
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param edges
	 *            the edges to set
	 */
	public void setEdges(List<Edge> connection) {
		this.edges = connection;
	}

	/**
	 * 
	 * @param name
	 */
	public Vertex(String name) {
		this.name = name;
		this.edges = new ArrayList<Edge>();
	}

	/**
	 * 
	 * @param edge
	 */
	public void addEdge(Edge edge) {
		edges.add(edge);
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

}
