package br.unifacisa.si.p3.model;

/**
 * 
 * @author Mateus Lourenco
 *
 */
public class Edge {
	//double distance;
	//double displacement;
	Node start;
	Node end;
	/**
	 * 
	 * @param start
	 * @param end
	 */
	public Edge(Node start, Node end) {
		this.start = start;
		this.end = end;
	}
}
