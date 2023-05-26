package DataStructure;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphBFS {
    private int vertices;
    private LinkedList<Integer> edge[];

    public GraphBFS(int vertices) {
        this.vertices = vertices;
        this.edge = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            edge[i] = new LinkedList();
        }
    }

    void addEdge(int vertices, int w){
        edge[vertices].add(w);
    }

    void BFS(int s){
        boolean visited[]  =new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList();

        visited[s] = true;
        queue.add(s);

        while(queue.size() != 0){
            s = queue.poll();
            System.out.print(s+ " ");

            Iterator<Integer> i = edge[s].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }




    public static void main(String[] args) {

        GraphBFS g = new GraphBFS(4);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);

        System.out.println("start from 2 vertice");
        g.BFS(2);
    }
}
