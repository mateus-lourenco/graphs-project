package br.unifacisa.si.p3.tests;


import static org.junit.Assert.*;

import org.junit.Test;

import br.unifacisa.si.p3.model.Graph;

public class GraphTest {

	//Cria��o do Grafo
		Graph graph = new Graph();
		
		
	/**
	 * @author Elnatan Emanuel
	 * 
	 * Teste de inser��o no n� (Vertice).
	 * 
	 */
	
	@Test
	public void testDeInsercaoNo() {
		graph.addNode("Campina Grande");
		graph.addNode("Jo�o Pessoa");
		graph.addNode("Recife");
		graph.addNode("Maceio");
		
		assertEquals(graph.getVertexes().size(), 4);
	}
	
	/**
	 * @author Elnatan Emanuel
	 * 
	 * Teste de inser��o da aresta.
	 * 
	 */
	
	@Test
	public void testDeInsercaoAresta() {
		
		graph.addEdge(graph.addNode("Campina Grande"), graph.addNode("Jo�o Pessoa"), 0);
		graph.addEdge(graph.addNode("Joao Pessoa"), graph.addNode("Recife"), 0);
		graph.addEdge(graph.addNode("Recife"), graph.addNode("Maceio"), 0);
		
		
		assertEquals(graph.getEdges().size(), 3);
	}
	
	/**
	 * @author Andrews
	 * 
	 * Teste de inser��o da aresta com dist�ncia.
	 * 
	 */
	
	@Test
	public void testDeInsercaoAresta02() {
		
		graph.addEdge(graph.addNode("Maracaja�"), graph.addNode("Olinda"), 200);
		graph.addEdge(graph.addNode("Pocinhos"), graph.addNode("Caturit�"), 100);
		graph.addEdge(graph.addNode("S�o Luis MA"), graph.addNode("Pouso Alegre"), 500);
		
		assertEquals(graph.getEdgeDistance(0), 200, 0);
		
	}
	
	
	/**
	 * @author Andrews
	 * 
	 * Teste de inser��o da aresta com dist�ncia.
	 * 
	 */
	
	@Test
	public void testDeInsercaoArestaIndex() {
		
		graph.addEdge(graph.addNode("Maracaja�"), graph.addNode("Olinda"), 200);
		graph.addEdge(graph.addNode("Pocinhos"), graph.addNode("Caturit�"), 100);
		graph.addEdge(graph.addNode("S�o Luis MA"), graph.addNode("Pouso Alegre"), 500);
		
		assertEquals(graph.getVertexByIndex(0), "Maracaja�");
		
	}
	
	
	

}
