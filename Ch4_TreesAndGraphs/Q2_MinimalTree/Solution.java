package Ch4_TreesAndGraphs.Q2_MinimalTree;

import java.util.*;

/*
Given a sorted (increasing order) array with unique integer elements, write an algorithm
to create a binary search tree with minimal height.
*/
public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        minimalTree(arr).printTreeInOrder();
        ;
    }

    public static Tree minimalTree(int[] arr) {
        Tree t = new Tree(minimalTree(arr, 0, arr.length - 1));
        return t;
    }

    public static TreeNode minimalTree(int[] arr, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (end + start) / 2;
        TreeNode node = new TreeNode(arr[mid]);

        node.left = minimalTree(arr, start, mid - 1);
        node.right = minimalTree(arr, mid + 1, end);
        return node;
    }

}