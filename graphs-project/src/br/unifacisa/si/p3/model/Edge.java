package br.unifacisa.si.p3.model;

/**
 * 
 * @author Mateus Lourenco
 *
 */
public class Edge {
	
	
	double distance;
	Node start;
	Node end;
	/**
	 * 
	 * @param start
	 * @param end
	 */
	public Edge(Node start, Node end, double distance) {
		this.start = start;
		this.end = end;
		this.distance =  distance;
	}
	
	public double getDistance() {
		return distance;
	}
}
