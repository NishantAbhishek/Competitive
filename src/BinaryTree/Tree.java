package BinaryTree;

public class Tree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node node = tree.createNode();
        tree.printLeftView(node);//1 2 4 8
        System.out.println();
        tree.printRightView(node);//1 3 7 14
        System.out.println();
        tree.preOrder(node);//1 2 4 8 9 5 10 11 3 6 13 7 14
        System.out.println();
        tree.postOrder(node);//8 9 4 10 11 5 2 13 6 14 7 3 1
        System.out.println();
        tree.inOrder(node);//8 4 9 2 10 5 11 1 6 13 3 14 7
        System.out.println();
        System.out.println("Height:- "+tree.findHeight(node));
    }


    public int findHeight(Node node){
        if(node==null){
            return 0;
        }

        int rightHeight = findHeight(node.left);//step 1
        int leftHeight = findHeight(node.right);//step 2

        if(rightHeight>leftHeight){
            return rightHeight+1;
        }else{
            return  leftHeight+1;
        }

    }

    //root left right
    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.nodeValue + " ");
        preOrder(node.left);
        preOrder(node.right);
    }


    //
    //left right root
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.nodeValue + " ");
    }


    //left root right
    public void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.nodeValue + " ");
        inOrder(node.right);
    }


    public void printLeftView(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.nodeValue + " ");
        printLeftView(node.left);
    }

    public void printRightView(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.nodeValue + " ");
        printRightView(node.right);
    }

    public Node createNode() {
        Node node = new Node(1);

        //layer 1
        node.left = new Node(2);
        node.right = new Node(3);


        //layer 2
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);


        //layer 3
        node.left.left.left = new Node(8);
        node.left.left.right = new Node(9);
        node.left.right.left = new Node(10);
        node.left.right.right = new Node(11);
        node.right.left.right = new Node(13);
        node.right.right.left = new Node(14);
        return node;
    }


}


