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
		this.distance =  distance;
	}
	
	
	public double getDistance() {
		return distance;
	}



	
}
