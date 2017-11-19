package br.unifacisa.si.p3.model;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Mateus Lourenco
 *
 */
public class Graph {
	List<Vertex> vertexes;
	List<Edge> edges;

	public Graph() {
		this.vertexes = new LinkedList<Vertex>();
		this.edges = new LinkedList<Edge>();
	}

	/**
	 * @author Andrews
	 * @return vertexes
	 */
	public List<Vertex> getVertexes() {
		return vertexes;
	}

	/**
	 * @author Andrews
	 * @return connections
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
	public String getVertexNameByIndex(int index) {
		return vertexes.get(index).getName();
	}

	/**
	 * 
	 * @param index
	 * @return vertex by index
	 */
	public Vertex getVertexByIndex(int index) {
		return vertexes.get(index);
	}

	/**
	 * 
	 * @param index
	 * @return edge by index
	 */
	public Edge getEdgeByIndex(int index) {
		return edges.get(index);
	}
	/**
	 * 
	 * @param name
	 * @return value inserted
	 */
	public Vertex addVertex(String name) {
		Vertex v = new Vertex(name);
		vertexes.add(v);
		return v;
	}

	/**
	 * 
	 * @param start
	 * @param end
	 * @return value inserted
	 */
	public void addEdge(Vertex start, Vertex end, double distance) {
		Edge edge = new Edge(start, end, distance);
		start.addConnection(edge);
		edges.add(edge);
	}
}
