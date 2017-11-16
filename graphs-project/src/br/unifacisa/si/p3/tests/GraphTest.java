package br.unifacisa.si.p3.tests;


import static org.junit.Assert.*;

import org.junit.Test;

import br.unifacisa.si.p3.model.Graph;

public class GraphTest {

	//Cria��o do Grafo
		Graph grafo = new Graph();
		
		
	/**
	 * @author Elnatan Emanuel
	 * 
	 * Teste de inser��o no n�(Vertice).
	 * 
	 */
	
	@Test
	public void testDeInsercaoNo() {
		grafo.addNode("Campina Grande");
		grafo.addNode("Jo�o Pessoa");
		grafo.addNode("Recife");
		grafo.addNode("Maceio");
		
		assertEquals(grafo.getNodes().size(), 4);
	}
	
	/**
	 * @author Elnatan Emanuel
	 * 
	 * Teste de inser��o da aresta.
	 * 
	 */
	
	@Test
	public void testDeInsercaoAresta() {
		
		grafo.addEdge(grafo.addNode("Campina Grande"), grafo.addNode("Jo�o Pessoa"), 0);
		grafo.addEdge(grafo.addNode("Joao Pessoa"), grafo.addNode("Recife"), 0);
		grafo.addEdge(grafo.addNode("Recife"), grafo.addNode("Maceio"), 0);
		
		
		assertEquals(grafo.getEdges().size(), 3);
	}
	
	/**
	 * @author Andrews
	 * 
	 * Teste de inser��o da aresta com dist�ncia.
	 * 
	 */
	
	@Test
	public void testDeInsercaoAresta02() {
		
		grafo.addEdge(grafo.addNode("Maracaja�"), grafo.addNode("Olinda"), 200);
		grafo.addEdge(grafo.addNode("Pocinhos"), grafo.addNode("Caturit�"), 100);
		grafo.addEdge(grafo.addNode("S�o Luis MA"), grafo.addNode("Pouso Alegre"), 500);
		
		assertEquals(grafo.getEdgeDistance(0), 200, 0);
		
	}
	
	
	/**
	 * @author Andrews
	 * 
	 * Teste de inser��o da aresta com dist�ncia.
	 * 
	 */
	
	@Test
	public void testDeInsercaoArestaIndex() {
		
		grafo.addEdge(grafo.addNode("Maracaja�"), grafo.addNode("Olinda"), 200);
		grafo.addEdge(grafo.addNode("Pocinhos"), grafo.addNode("Caturit�"), 100);
		grafo.addEdge(grafo.addNode("S�o Luis MA"), grafo.addNode("Pouso Alegre"), 500);
		
		assertEquals(grafo.getNodeIndex(0), "Maracaja�");
		
	}
	
	
	

}
