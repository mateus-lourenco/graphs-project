package br.unifacisa.si.p3.tests;

import org.junit.Assert;
import org.junit.Test;

import br.unifacisa.si.p3.model.Graph;

public class GraphTest {

	//Criação do Grafo
		Graph grafo = new Graph();
		
		
	/**
	 * @author Elnatan Emanuel
	 * 
	 * Teste de inserção no nó(Vertice).
	 * 
	 */
	
	@Test
	public void testDeInsercaoNo() {
		grafo.addNode("Campina Grande");
		grafo.addNode("João Pessoa");
		grafo.addNode("Recife");
		grafo.addNode("Maceio");
		
		Assert.assertEquals(grafo.getNodes().size(), 4);
	}
	
	/**
	 * @author Elnatan Emanuel
	 * 
	 * Teste de inserção da aresta.
	 * 
	 */
	
	@Test
	public void testDeInsercaoAresta() {
		
		grafo.addEdge(grafo.addNode("Campina Grande"), grafo.addNode("João Pessoa"));
		grafo.addEdge(grafo.addNode("Joao Pessoa"), grafo.addNode("Recife"));
		grafo.addEdge(grafo.addNode("Recife"), grafo.addNode("Maceio"));
		
		
		Assert.assertEquals(grafo.getEdges().size(), 3);
	}

}
