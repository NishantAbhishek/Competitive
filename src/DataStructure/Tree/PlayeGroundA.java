package DataStructure.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public  class PlayeGroundA {
    
    public static void main(String[] args) {
        PlayeGroundA playeGroundA = new PlayeGroundA();
        System.out.println(heightOfTree(playeGroundA.treeA()));
    }

    public static int heightOfTree(Node node){
        if(node==null){
            return 0;
        }

        int leftHeight = heightOfTree(node.left);
        int rightHeight = heightOfTree(node.right);

        if(leftHeight>rightHeight){
            return leftHeight+1;
        }else{
            return rightHeight+1;
        }
    }

    public static void levelTraversalTesting(){
        PlayeGroundA playeGroundA = new PlayeGroundA();
        Node node = playeGroundA.treeA();
        levelOrdereTraversal(node);
    }

    public static void depthFirstSearch(){
        PlayeGroundA playeGroundA = new PlayeGroundA(); 
        Node node =  playeGroundA.treeA();
        playeGroundA.preOrderTraversal(node);
        System.out.println("");
        playeGroundA.inOrderTraversal(node);
        System.out.println("");
        playeGroundA.postOrderTraversal(node);
        System.out.println("");
    }

    public static void levelOrdereTraversal(Node node){
        Queue<Node> data = new LinkedList<>();
        if(node!=null){
            data.add(node);
        }

        while(!data.isEmpty()){
            Node current = data.remove();
            System.out.println(current.nodeValue);

            Node leftNode = current.left;
            Node rightNode = current.right;

            if(leftNode!=null){
                data.add(leftNode);
            }

            if(rightNode!=null){
                data.add(rightNode);
            }
        }
        
    }

    public  Node treeA(){
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);

        node.left.left = new Node(4);
        node.left.right = new Node(5);

        node.right.left = new Node(6);
        node.right.right = new Node(7);
        return node;
    }
    
    //Preorder R L R : 1 2 4 5 3 6 7
    public void preOrderTraversal(Node node){
        if(node==null){
            return;
        }

        System.out.print(node.nodeValue+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }


    //InOrder LEFT ROOT RIGHT:  4 2 5 1 6 3 7
    public void inOrderTraversal(Node node){
        if(node==null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.nodeValue+" ");
        inOrderTraversal(node.right);
    }


    //Post Order traversal Left Right Root: 4 5 2 6 7 3 1
    public void postOrderTraversal(Node node){
        if(node==null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.nodeValue+" ");
    }
}
