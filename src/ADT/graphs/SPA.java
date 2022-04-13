//package ADT.graphs;
//
//import ADT.graphs.Graph.Edge;
//
//import java.util.List;
//import java.util.Map;
//
//public class SPA {
//
//    private static int dfs(int node, int i, boolean[] visited,
//                           int[] ordering, Map<Integer, List<Edge>> graph) {
//
//        visited[i] = true;
//        List<Edge> edgeList= graph.get(i);
//
//        if(edgeList != null)
//            for (Edge edge : edgeList)
//                if(!visited[edge.to])
//                    i = dfs(i,edge.to,visited,ordering,graph);
//        ordering[node] = i;
//        return node-1;
//    }
//
//    static int[] TopologicalSort(Map<Integer, List<Edge>> graph, int numNodes){
//
//        int orderedArr[] = new int[numNodes];
//        boolean V[] = new boolean[numNodes];
//        int node = numNodes-1;
//
//        for (int i = 0; i < numNodes; i++)
//            if(!V[i])
//                dfs(node,i,V,orderedArr,graph);
//
//        return orderedArr;
//    }
//
////    static Integer[] DGASPA(Map<Integer, List<Edge>> graph,int start, int numNodes){
////
////    }
//
//    public static void main(String[] args)
//    {
//
//
//    }
//
//
//}
//
//
//
