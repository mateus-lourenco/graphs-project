package br.unifacisa.si.p3.model;

/**
 * 
 * @author Mateus Lourenco
 *
 */
public class Edge {

	double distance;
	Vertex start;
	Vertex end;

	/**
	 * 
	 * @param start
	 * @param end
	 * @param distance
	 */
	public Edge(Vertex start, Vertex end, double distance) {
		this.start = start;
		this.end = end;
		this.distance = distance;
	}

	/**
	 * 
	 * @return distance
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * @return the start
	 */
	public Vertex getStart() {
		return start;
	}

	/**
	 * @return the end
	 */
	public Vertex getEnd() {
		return end;
	}

}
