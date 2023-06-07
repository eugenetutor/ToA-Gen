package DataStructure;

import java.util.ArrayList;

public class GraphDFS {
    ArrayList<Node> nodes;
    int[][] matrix;
    GraphDFS(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }
    //Add node
    public void addNode(Node node){
        nodes.add(node);
    }
    //Add Edge
    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }
    //Check Edge
    public boolean checkEdge(int src, int dst){
        return matrix[src][dst] == 1;
    }
    public void print(){
        System.out.print(" ");
        for(Node node : nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void DFS(int src){
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src, visited);
    }

    private void dFSHelper(int src, boolean[] visited) {
        if(visited[src]){
            return;
        }else{
            visited[src]  = true;
            System.out.println(nodes.get(src).data + " = visited");
        }
        for (int i = 0; i < matrix[src].length; i++) {
            if(matrix[src][i] == 1){
                dFSHelper(i, visited);
            }
        }
        return;
    }

    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS(7);
        graph.addNode(new Node('N'));
        graph.addNode(new Node('W'));
        graph.addNode(new Node('H'));
        graph.addNode(new Node('K'));
        graph.addNode(new Node('T'));
        graph.addNode(new Node('A'));
        graph.addNode(new Node('X'));

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,4);
        graph.addEdge(1,5);
        graph.addEdge(3,6);

        graph.print();
        graph.DFS(0);
    }
}

class Node{
    char data;

    Node(char data){
        this.data = data;
    }
}
