package ADT.graphs;

public class Main {

    public static void main (String[] args){

        Graph graph = new Graph();
        graph.addBiEdge("B","C");
        graph.addBiEdge("D","A");
        graph.addBiEdge("D","C");
        graph.addUniEdge("C","E");
        graph.addUniEdge("D","F");
        graph.addBiEdge("C","F");
        graph.addBiEdge("A","B");
        graph.addUniEdge("F","G");
        graph.addUniEdge("G","C");
        graph.addUniEdge("G","G");
        System.out.println(graph);
        graph.removeUniEdge("D","C");
        graph.addBiEdge("G","A");
        graph.addUniEdge("F","B");
        System.out.println("\n\n"+graph);
    }
}
