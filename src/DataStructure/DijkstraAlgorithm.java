package DataStructure;

import java.util.*;

public class DijkstraAlgorithm {
    private static final int INFINITY = Integer.MAX_VALUE;

    private static class Edge{
        int destination;
        int weight;

        public Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    public  void dijkstra(List<List<Edge>> graph, int source){
        int numVertices = graph.size();
        int[] distances = new int[numVertices];
        int[] privious  = new int[numVertices];

        Set<Integer> visited = new HashSet<>();

        Arrays.fill(distances, INFINITY);
        distances[source] = 0;


        for(int i = 0; i < numVertices; i++){
            int current = getMinDistance(distances, visited);
            visited.add(current);

            for(Edge edge : graph.get(current)){
                int neighbor = edge.destination;
                int weight = edge.weight;

                if(!visited.contains(neighbor)){
                    int newDistance  = distances[current] + weight;
                    if(newDistance < distances[neighbor]){
                        distances[neighbor] = newDistance;
                        privious[neighbor] = current;
                    }
                }
            }
        }

        for(int i = 0; i < numVertices; i++){
            System.out.println("Shortest distance "+ i + ": "+ distances[i]);
            System.out.print("Shortest path: ");
            printPath(privious, i);
            System.out.println();
        }

    }
    private int getMinDistance(int[] distances, Set<Integer> visited) {
        int minDistance = INFINITY;
        int minIndex  = -1;
        for (int i = 0; i < distances.length; i++) {
            if(!visited.contains(i) && distances[i] < minDistance){
                minDistance = distances[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    private void printPath(int[] privious, int i) {
        if(i == 0){
            System.out.println("0");
        }else if(privious[i] == 0){
            System.out.println("0 -> "+ i);
        }else{
            printPath(privious, privious[i]);
            System.out.println("-> " + i);
        }
    }



    public static void main(String[] args) {

    }
}
