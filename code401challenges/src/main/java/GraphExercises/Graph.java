package GraphExercises;

import stacksandqueues.Queue;
import tree.Node;

import java.util.*;

public class Graph<T>{

    public HashMap<Vertex<T>, List<Edge<T>>> adjacencyList;
    public int size = 0;

//  Constructor
    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

//  Getters & Setters

    public HashMap<Vertex<T>, List<Edge<T>>> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(HashMap<Vertex<T>, List<Edge<T>>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }


//    AddNode() Adds a new node to the graph Takes in the value of that node & Returns the added node.
    public Vertex<T> addNode(T vertex){
        Vertex<T> node = new Vertex<>(vertex);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
        size++;

        return node;
    }


//    AddEdge() Adds a new edge between two nodes in the graph
//    Include the ability to have a “weight”
//    Takes in the two nodes (v1 & v2) to be connected by the edge
//    Both nodes should already be in the Graph
    public void addUndirectedEdge(Vertex<T> v1, Vertex<T> v2, int weight){
        addDirectedEdge(v1, v2, weight);
        addDirectedEdge(v2, v1, weight);
    }

    public void addDirectedEdge(Vertex<T> v1, Vertex<T> v2, int weight){
        Edge<T> edge = new Edge<>(weight, v2);
        adjacencyList.get(v1).add(edge);
    }


//    GetNodes() Returns all of the nodes in the graph as a collection (set, list, or similar)
    public List<Vertex<T>> getNodes(){
        List<Vertex<T>> vertices = new ArrayList<>();

        for (Vertex<T> vertex : adjacencyList.keySet()) {
            vertices.add(vertex);
        }

        return vertices;
    }

//    GetNeighbors() Returns a collection of nodes connected to the given node. Takes in a given node
    public List<Edge<T>> getNeighbors(Vertex<T> value){
        return adjacencyList.get(value);

    }

//    Size() Returns the total number of nodes in the graph
    public int size(){
        return size;
    }

//  BFT implementation
    public ArrayList<T> BFTraversal(Graph<T> graph, T root){
        ArrayList<T> visited = new ArrayList<>();
        Queue<T> queue = new Queue<>();

        if(root == null){
            return visited;
        } else {
            queue.enqueue(root);
            visited.add(root);
        }

        while(!queue.isEmpty()){
            for(Vertex<T> vertex : graph.getAdjacencyList().keySet()){

                if(!visited.contains(vertex)){
                    visited.add((T) vertex);
                    queue.enqueue((T) vertex);
                }
                break;
            }
        }
        return visited;
    }

}
