package br.unifacisa.si.p3.controller;

import java.util.ArrayList;

import br.unifacisa.si.p3.model.Graph;
import br.unifacisa.si.p3.model.Vertex;

public class DepthFirstSearchController {

	/**
	 * @author Elnatan Emanuel
	 * 
	 *         Realizar busca em profundidade
	 * 
	 * @param graph
	 */

	public void SearchDepth(Graph graph) {

		ArrayList<String> status = new ArrayList<String>();

		for (int i = 0; i < graph.getVertexes().size(); i++) {

			status.add(i, "unchecked");

		}

		for (int i = 0; i < graph.getVertexes().size(); i++) {

			if (status.get(i) == "unchecked") {

				visitDepth(graph, i, status);

			}
		}
	}

	/**
	 * 
	 * @author Mateus Lourenco
	 * @param graph
	 * @param i
	 * @param status
	 */
	private void visitDepth(Graph graph, int i, ArrayList<String> status) {

		status.set(i, "checked");
		Vertex vertex = graph.getEdgeByIndex(i).getStart();
		int iterator = 0;
		while (vertex != null) {
			if (status.get(iterator) == "unchecked") {
				visitDepth(graph, iterator, status);
			}
			++iterator;
			vertex = vertex.getConnectionByIndex(i).getEnd();
		}
		status.set(i, "visited");
	}

}