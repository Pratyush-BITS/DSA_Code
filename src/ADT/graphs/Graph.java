package ADT.graphs;

import java.util.*;

class Graph {
    private final Map<Vertex, Set<Vertex>> adjVertices;

    public Graph() {
        adjVertices = new HashMap<>();
    }

    void addVertex(String vertex) {
        adjVertices.putIfAbsent(new Vertex(vertex), new HashSet<>());
    }

    void remVertex(String vertex) {
        Vertex v = new Vertex(vertex);
        adjVertices.values().forEach(e -> e.remove(v));
        adjVertices.remove(v);
    }

    void addUniEdge(String from, String to) {
        Vertex v1 = new Vertex(from);
        Vertex v2 = new Vertex(to);
        addVertex(from);
        adjVertices.get(v1).add(v2);
    }

    void removeUniEdge(String from, String to){
        adjVertices.get(new Vertex(from)).remove(new Vertex(to));
    }

    void removeBiEdge(String v1,String v2){
        removeUniEdge(v1,v2);
        removeUniEdge(v2,v1);
    }

    void addBiEdge(String vertex1, String vertex2) {
        addUniEdge(vertex1, vertex2);
        addUniEdge(vertex2, vertex1);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        adjVertices.forEach((k,v)->sb.append(k).append("->").append(v).append('\n'));
        return sb.toString();
    }
}