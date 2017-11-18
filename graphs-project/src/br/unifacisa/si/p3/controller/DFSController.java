package br.unifacisa.si.p3.controller;

import java.util.ArrayList;

import br.unifacisa.si.p3.model.Graph;
import br.unifacisa.si.p3.model.Vertex;

public class DFSController {

	/**
	 * @author Elnatan Emanuel
	 * 
	 *         Realizar busca em prufundidade
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

	// TODO FINALIZAR A BUSCA EM PROFUNDIDADE
	
	private void visitDepth(Graph graph, int i, ArrayList<String> status) {
		int b;

		status.set(i, "checked");

		Vertex vertex = graph.getVertexByIndex(i);
		while (vertex != null) {
			b = 0;
			if (status.get(b) == "unchecked") {
				visitDepth(graph, b, status);
			}
		}
	}

}
