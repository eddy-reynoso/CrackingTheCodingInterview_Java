package Ch4_TreesAndGraphs.Q2_MinimalTree;

public class Tree {
    TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void printTreePreOrder() {
        printTreePreOrder(root);
    }

    public void printTreePreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        printTreePreOrder(root.left);
        printTreePreOrder(root.right);
    }

    public void printTreeInOrder() {
        printTreeInOrder(root);
    }

    public void printTreeInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        printTreeInOrder(root.left);
        System.out.println(root.value);
        printTreeInOrder(root.right);
    }

    public void printTreePostOrder() {
        printTreePostOrder(root);
    }

    public void printTreePostOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        printTreePostOrder(root.left);
        printTreeInOrder(root.right);
        System.out.print(root.value);
    }

}