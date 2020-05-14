package Ch4_TreesAndGraphs.Q1_RouteBetweenNodes;

import java.util.*;

public class Node {
    int data;
    ArrayList<Node> neighbors;
    boolean visited;

    public Node(int value) {
        data = value;
        neighbors = new ArrayList<Node>();
        visited = false;
    }

    void addNeighbor(Node node) {
        if (!neighbors.contains(node)) {
            neighbors.add(node);
        }
        if (!node.getNeighbors().contains(this)) {
            node.addNeighbor(this);
        }
    }

    ArrayList<Node> getNeighbors() {
        return neighbors;
    }

    void printNeighbors() {
        System.out.println();
        System.out.print(data + ": ");
        for (Node node : neighbors) {
            System.out.print(": -> " + node);
        }
        System.out.println();
        System.out.println();

    }
}