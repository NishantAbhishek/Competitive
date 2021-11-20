package DataStructure.Tree;

public  class PlayeGroundA {
    
    public static void main(String[] args) {
        PlayeGroundA playeGroundA = new PlayeGroundA();
        Node node =  playeGroundA.treeA();
        playeGroundA.postOrderTraversal(node);
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

        System.out.println(node.nodeValue);
        inOrderTraversal(node.left);
        inOrderTraversal(node.right);
    }


    //InOrder LEFT ROOT RIGHT:  4 2 5 1 6 3 7
    public void inOrderTraversal(Node node){
        if(node==null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(node.nodeValue);
        inOrderTraversal(node.right);
    }


    //Post Order traversal Left Right Root: 4 5 2 6 7 3 1
    public void postOrderTraversal(Node node){
        if(node==null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.nodeValue);
    }
}
