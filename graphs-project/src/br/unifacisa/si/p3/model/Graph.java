package br.unifacisa.si.p3.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mateus Lourenco
 *
 */
public class Graph {
	List<Vertex> vertexes;
	List<Edge> edges;

	public Graph() {
		this.vertexes = new ArrayList<Vertex>();
		this.edges = new ArrayList<Edge>();
	}

	/**
	 * @author Andrews
	 * @param vertexes
	 */
	public void setVetex(List<Vertex> vertexes) {
		this.vertexes = vertexes;
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
	 * @return vertexes
	 */
	public List<Vertex> getVertexes() {
		return vertexes;
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
	public String getVertexNameIndex(int index) {
		return vertexes.get(index).getName();
	}

	/**
	 * @author Mateus Lourenco
	 * @param index
	 * @return vertex by index
	 */
	public Vertex getVertexByIndex(int index) {
		return vertexes.get(index);
	}

	/**
	 * 
	 * @param name
	 * @return value inserted
	 */
	public Vertex addNode(String name) {
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
		start.addEdge(edge);
		edges.add(edge);
	}
}
