package BinaryTree;

public class Tree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node node = tree.createNode();
        tree.printLeftView(node);//1 2 4 6
        System.out.println();
        tree.printRightView(node);//1 3 8 9
        System.out.println();
        tree.preOrder(node);//1 2 4 6 5 7 3 8 9
        System.out.println();
        tree.postOrder(node);//6 4 7 5 2 9 8 3 1
        System.out.println();
        tree.inOrder(node);//6 4 2 5 7 1 3 8 9
    }

    //root left right
    public void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.nodeValue+" ");
        preOrder(node.left);
        preOrder(node.right);
    }


    //
    //left right root
    public void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.nodeValue+" ");
    }


    //left root right
    public void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.nodeValue+" ");
        inOrder(node.right);
    }


    public void printLeftView(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.nodeValue+" ");
        printLeftView(node.left);
    }

    public void printRightView(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.nodeValue+" ");
        printRightView(node.right);
    }

    public Node createNode() {

        //level 1
        Node node = new Node(1);

        //level 2
        node.left = new Node(2);
        node.right = new Node(3);

        //level 3
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.right = new Node(8);

        //level 4
        node.left.left.left = new Node(6);
        node.left.right.right = new Node(7);
        node.right.right.right = new Node(9);
        return node;
    }


}


