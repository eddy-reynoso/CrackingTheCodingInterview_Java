package Ch4_TreesAndGraphs.Q1_RouteBetweenNodes;

import java.util.*;

public class Graph {
    ArrayList<Node> graph;

    public Graph() {
        graph = new ArrayList<Node>();
    }

    void addNode(Node node) {
        graph.add(node);
    }

    void printGraph() {
        System.out.println();
        for (Node node : graph) {
            System.out.print(node.data + ": ");
            for (Node neighbor : node.getNeighbors()) {
                System.out.print(neighbor.data + " -> ");
            }
            System.out.println("null");
        }
        System.out.println();
    }

    ArrayList<Node> bfs(Node start) {
        Queue<Node> q = new LinkedList<Node>();
        start.visited = true;
        ArrayList<Node> traversal = new ArrayList<Node>();
        q.add(start);
        traversal.add(start);

        while (!q.isEmpty()) {
            Node curr = q.remove();
            // System.out.println(curr.data);
            for (Node neighbor : curr.getNeighbors()) {
                if (!neighbor.visited) {
                    neighbor.visited = true;
                    q.add(neighbor);
                    traversal.add(neighbor);

                }
            }
        }
        return traversal;
    }

}