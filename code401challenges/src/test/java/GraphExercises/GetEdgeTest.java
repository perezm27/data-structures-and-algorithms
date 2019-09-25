package GraphExercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {

    @Test
    public void testGetEdge() {

        Graph<String> graph = new Graph<>();
        GetEdge test = new GetEdge();

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




        assertEquals("[Pandora, Arendelle, Monstroplolis, Metroville, Naboo, Narnia]", test.getEdge(graph));

    }
}