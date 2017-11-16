package br.unifacisa.si.p3.tests;


import static org.junit.Assert.*;

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
		
		assertEquals(grafo.getNodes().size(), 4);
	}
	
	/**
	 * @author Elnatan Emanuel
	 * 
	 * Teste de inserção da aresta.
	 * 
	 */
	
	@Test
	public void testDeInsercaoAresta() {
		
		grafo.addEdge(grafo.addNode("Campina Grande"), grafo.addNode("João Pessoa"), 0);
		grafo.addEdge(grafo.addNode("Joao Pessoa"), grafo.addNode("Recife"), 0);
		grafo.addEdge(grafo.addNode("Recife"), grafo.addNode("Maceio"), 0);
		
		
		assertEquals(grafo.getEdges().size(), 3);
	}
	
	/**
	 * @author Andrews
	 * 
	 * Teste de inserção da aresta com distância.
	 * 
	 */
	
	@Test
	public void testDeInsercaoAresta02() {
		
		grafo.addEdge(grafo.addNode("Maracajaú"), grafo.addNode("Olinda"), 200);
		grafo.addEdge(grafo.addNode("Pocinhos"), grafo.addNode("Caturité"), 100);
		grafo.addEdge(grafo.addNode("São Luis MA"), grafo.addNode("Pouso Alegre"), 500);
		
		assertEquals(grafo.getEdgeDistance(0), 200, 0);
		
	}
	
	
	/**
	 * @author Andrews
	 * 
	 * Teste de inserção da aresta com distância.
	 * 
	 */
	
	@Test
	public void testDeInsercaoArestaIndex() {
		
		grafo.addEdge(grafo.addNode("Maracajaú"), grafo.addNode("Olinda"), 200);
		grafo.addEdge(grafo.addNode("Pocinhos"), grafo.addNode("Caturité"), 100);
		grafo.addEdge(grafo.addNode("São Luis MA"), grafo.addNode("Pouso Alegre"), 500);
		
		assertEquals(grafo.getNodeIndex(0), "Maracajaú");
		
	}
	
	
	

}
