package DataStructure.Tree;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class PlayGroundB {
    
    public static void main(String[] args) {
        Node nodeA = createTreeA();
        Node nodeB = createTreeB();
        System.out.println(identicalIterative(nodeA, nodeB)); 
    }

    public static boolean identicalIterative(Node nodeA,Node nodeB){
        boolean isIdentical = true;

        Queue<Pair<Node,Node>> data = new LinkedList<>();

        if(nodeA!=null&&nodeB!=null){
            data.add(new Pair(nodeA, nodeB));
        }

        while(!data.isEmpty()&&isIdentical){
            Pair p = data.remove();
            Node nodeFirst =(Node) p.first;
            Node nodeSecond =(Node) p.second;

            if((nodeFirst!=null && nodeSecond==null) || (nodeSecond!=null && nodeFirst==null)){
                isIdentical = false;
            }

            if(nodeFirst!=null && nodeSecond!=null){
                if(nodeFirst.nodeValue==nodeSecond.nodeValue){
                    data.add(new Pair(nodeFirst.left, nodeSecond.left));
                    data.add(new Pair(nodeFirst.right, nodeSecond.right));
                }else{
                    isIdentical = false;
                }
            } 
        }

        return isIdentical;
    }

    public static Node createTreeA(){
        Node x = new Node(15);
        x.left = new Node(10);
        x.right = new Node(20);
        x.left.left = new Node(8);
        x.left.right = new Node(12);
        x.right.left = new Node(16);
        x.right.right = new Node(25);

        return x;
    }

    public static Node createTreeB(){
        Node x = new Node(15);
        x.left = new Node(10);
        x.right = new Node(20);
        x.left.left = new Node(8);
        x.left.right = new Node(12);
        x.right.left = new Node(16);
        x.right.right = new Node(100);
        return x;
    }




}

class Pair<U,V>{
    public final U first;
    public final V second;

    Pair(U first_, V second_){
        first = first_;
        second = second_;
    }    
}
