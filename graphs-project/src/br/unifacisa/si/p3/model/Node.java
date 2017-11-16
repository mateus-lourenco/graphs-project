package br.unifacisa.si.p3.model;

import java.util.List;

/**
 * 
 * @author Mateus Lourenco
 *
 */
public class Node {
	String name;
	List<Edge> connections;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the connections
	 */
	public List<Edge> getConnections() {
		return connections;
	}
	/**
	 * @param connections the connections to set
	 */
	public void setConnections(List<Edge> connections) {
		this.connections = connections;
	}
}
