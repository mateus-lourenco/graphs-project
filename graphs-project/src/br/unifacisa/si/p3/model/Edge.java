package br.unifacisa.si.p3.model;

/**
 * 
 * @author Mateus Lourenco
 *
 */
public class Edge {
	double distance;
	double displacement;
	Node start;
	Node end;

	/**
	 * @return the distance
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * @param distance
	 *            the distance to set
	 */
	public void setDistance(double distance) {
		this.distance = distance;
	}

	/**
	 * @return the displacement
	 */
	public double getDisplacement() {
		return displacement;
	}

	/**
	 * @param displacement
	 *            the displacement to set
	 */
	public void setDisplacement(double displacement) {
		this.displacement = displacement;
	}

	/**
	 * @return the start
	 */
	public Node getStart() {
		return start;
	}

	/**
	 * @param start
	 *            the start to set
	 */
	public void setStart(Node start) {
		this.start = start;
	}

	/**
	 * @return the end
	 */
	public Node getEnd() {
		return end;
	}

	/**
	 * @param end
	 *            the end to set
	 */
	public void setEnd(Node end) {
		this.end = end;
	}
}
