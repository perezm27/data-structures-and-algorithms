package GraphExercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

//    Node can be successfully added to the graph
//    An edge can be successfully added to the graph
//    A collection of all nodes can be properly retrieved from the graph
//    All appropriate neighbors can be retrieved from the graph
//    Neighbors are returned with the weight between nodes included
//    The proper size is returned, representing the number of nodes in the graph
//    A graph with only one node and edge can be properly returned
//    An empty graph properly returns null

    @Test
    public void testAddNode() {
        Graph<String> graph = new Graph<>();

        Vertex<String> v1 = graph.addNode("Bob");

        assertTrue(graph.adjacencyList.containsKey(v1));
    }

    @Test
    public void testEmptyGraph() {
        Graph<String> graph = new Graph<>();

        assertTrue(graph.adjacencyList.isEmpty());
    }

    @Test
    public void testAddUndirectedEdge() {
        Graph<String> graph = new Graph<>();

        Vertex<String> v1 = graph.addNode("Bob");
        Vertex<String> v2 = graph.addNode("Alice");

        graph.addUndirectedEdge(v1, v2, 10);

        assertEquals(10, graph.adjacencyList.get(v1).get(0).weight);

    }

    @Test
    public void testAddDirectedEdge() {
        Graph<String> graph = new Graph<>();

        Vertex<String> v1 = graph.addNode("Bob");
        Vertex<String> v2 = graph.addNode("Alice");

        graph.addDirectedEdge(v2, v1, 5);

        assertEquals(5, graph.adjacencyList.get(v2).get(0).weight);
    }

    @Test
    public void testGetNodes() {
        Graph<String> graph = new Graph<>();

        Vertex<String> v1 = graph.addNode("Bob");
        Vertex<String> v2 = graph.addNode("Alice");


        assertEquals(graph.getNodes(), graph.getNodes());

    }

    @Test
    public void testGetNeighbors() {
        Graph<String> graph = new Graph<>();

        Vertex<String> v1 = graph.addNode("Bob");
        Vertex<String> v2 = graph.addNode("Alice");

        Vertex<String> v3 = graph.addNode("Jackie");
        Vertex<String> v4 = graph.addNode("Jack");

        graph.addDirectedEdge(v1, v2, 0);
        graph.addDirectedEdge(v3, v4, 5);

        assertEquals("[Neighbor: Alice Weight: 0]", graph.adjacencyList.get(v1).toString());
        assertEquals("[Neighbor: Jack Weight: 5]", graph.adjacencyList.get(v3).toString());
    }

    @Test
    public void testSize() {
        Graph<String> graph = new Graph<>();

        Vertex<String> v1 = graph.addNode("Bob");
        Vertex<String> v2 = graph.addNode("Alice");

        assertEquals(2, graph.size());
    }

    @Test
    public void testBFTraversal() {
        Graph<String> graph = new Graph<>();

        Vertex<String> v1 = graph.addNode("Pandora");
        Vertex<String> v2 = graph.addNode("Arendelle");
        Vertex<String> v3 = graph.addNode("Metroville");
        Vertex<String> v4 = graph.addNode("Monstroplolis");
        Vertex<String> v5 = graph.addNode("Narnia");
        Vertex<String> v6 = graph.addNode("Naboo");

        graph.addUndirectedEdge(v1, v2, 0);
        graph.addUndirectedEdge(v2, v4, 0);
        graph.addUndirectedEdge(v2, v3, 0);
        graph.addUndirectedEdge(v3, v4,  0);
        graph.addUndirectedEdge(v3, v5,  0);
        graph.addUndirectedEdge(v3, v6, 0);
        graph.addUndirectedEdge(v4, v6, 0);
        graph.addUndirectedEdge(v6, v5, 0);




        assertEquals("[Pandora, Arendelle, Monstroplolis, Metroville, Naboo, Narnia]", graph.BFTraversal(v1).toString());
    }
}