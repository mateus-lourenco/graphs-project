package br.unifacisa.si.p3.controller;

import java.util.ArrayList;

import br.unifacisa.si.p3.model.Graph;

public class BuscarController {

	/**
	 * @author Elnatan Emanuel
	 * 
	 * Realizar busca em prufundidade
	 * 
	 * @param graph
	 */

	public void buscaPronfundidade(Graph graph) {

		ArrayList<String> status = new ArrayList<String>();

		for (int i = 0; i < graph.getNodes().size(); i++) {

			status.add(i, "Não Conferido");

		}

		for (int i = 0; i < graph.getNodes().size(); i++) {

			if (status.get(i) == "Não Conferido") {

				visitarProfun(graph, i, status);

			}

		}

	}
	
	// falta terminar de implemtar
	private void visitarProfun(Graph graph, int i, ArrayList<String> status) {
			status.set(i, "Conferindo");
			
	}

}
