package BinaryTree;

public class Node {
    Node left;
    Node right;
    int nodeValue;

    public Node(int nodeValue) {
        this.nodeValue = nodeValue;
    }

    public void setLeft(Node node) {
        left = node;
    }

    public void setRight(Node node) {
        right = node;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}

