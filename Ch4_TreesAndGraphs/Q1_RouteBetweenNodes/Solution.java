package Ch4_TreesAndGraphs.Q1_RouteBetweenNodes;

import java.util.*;

/*
Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
*/
public class Solution {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        Graph graph = new Graph();
        graph.addNode(a);
        graph.addNode(b);
        graph.addNode(c);
        graph.addNode(d);
        graph.addNode(e);
        graph.addNode(f);

        a.addNeighbor(b);
        b.addNeighbor(c);
        c.addNeighbor(d);
        d.addNeighbor(e);
        e.addNeighbor(a);
        System.out.println(isPath(graph, e, a));

    }

    public static boolean isPath(Graph g, Node start, Node end) {
        if (g.bfs(start).contains(end)) {
            return true;
        }
        return false;
    }

}