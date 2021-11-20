package DataStructure.Tree;

class Node{
    public int nodeValue;
    public Node left;
    public Node right;

    Node(int value){
        nodeValue = value;
    }
    public Node(int value, Node leftNode, Node rightNode){
        nodeValue = value;
        leftNode = leftNode;
        rightNode = rightNode;
    }
}