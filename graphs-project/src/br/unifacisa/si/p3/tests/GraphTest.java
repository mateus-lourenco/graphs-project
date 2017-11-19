package br.unifacisa.si.p3.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import br.unifacisa.si.p3.model.Graph;

public class GraphTest {

	/**
	 * @author Elnatan Emanuel
	 * 
	 *         Teste de inserção no nó (Vertice).
	 * 
	 */

	@Test
	public void testDeInsercaoNo() {
		Graph graph = new Graph();

		graph.addVertex("Campina Grande");
		graph.addVertex("João Pessoa");
		graph.addVertex("Recife");
		graph.addVertex("Maceio");

		assertEquals(graph.getVertexes().size(), 4);
	}

	/**
	 * @author Elnatan Emanuel
	 * 
	 *         Teste de inserção da aresta.
	 * 
	 */

	@Test
	public void testDeInsercaoAresta() {
		Graph graph = new Graph();

		graph.addEdge(graph.addVertex("Campina Grande"), graph.addVertex("João Pessoa"), 0);
		graph.addEdge(graph.addVertex("Joao Pessoa"), graph.addVertex("Recife"), 0);
		graph.addEdge(graph.addVertex("Recife"), graph.addVertex("Maceio"), 0);

		assertEquals(graph.getEdges().size(), 3);
	}

	/**
	 * @author Andrews
	 * 
	 *         Teste de inserção da aresta com distância.
	 * 
	 */

	@Test
	public void testDeInsercaoAresta02() {
		Graph graph = new Graph();

		graph.addEdge(graph.addVertex("Maracajaú"), graph.addVertex("Olinda"), 200);
		graph.addEdge(graph.addVertex("Pocinhos"), graph.addVertex("Caturité"), 100);
		graph.addEdge(graph.addVertex("São Luis MA"), graph.addVertex("Pouso Alegre"), 500);

		assertEquals(graph.getEdgeDistance(0), 200, 0);

	}

	/**
	 * @author Andrews
	 * 
	 *         Teste de inserção da aresta com distância.
	 * 
	 */

	@Test
	public void testDeInsercaoArestaIndex() {
		Graph graph = new Graph();

		graph.addEdge(graph.addVertex("Maracajaú"), graph.addVertex("Olinda"), 200);
		graph.addEdge(graph.addVertex("Pocinhos"), graph.addVertex("Caturité"), 100);
		graph.addEdge(graph.addVertex("São Luis MA"), graph.addVertex("Pouso Alegre"), 500);

		assertEquals(graph.getVertexByIndex(0).getName(), "Maracajaú");

	}

}
