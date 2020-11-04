//import java.util.Stack;
//
//public class MergeBinary {
//
//    Stack<Node> stack = new Stack<Node>();
//    Node1 root;
//    Node1 current = null;
//
//    void inOrder(Node node){
//        if(node == null){
//            return;
//        }
//        inOrder(node.left);
//        System.out.println("The current node is" +node.data);
//        inOrder(node.right);
//    }
//    void MergeTrees( Node t1, Node t2){
//        while (!stack.empty()){
//
//            if (t1.current != null && t2.current !=null){
//                t1.val = stack.pop(t1.current) + stack.pop(t2.current);
//            }
//
//            if ( t1.current == null){
//                t1.val = stack.pop(t2.current);
//            }
//            if (t2.current == null){
//                t1.val = stack.pop(t1.current);
//            }
//
//        }
//    }
//
//
//    public static void main(String S[]){
//
//        Node1 tree1 = new Node1(1);
//        Node1 tree2.left = new Node1(3);
//        Node1 tree2.right = new Node1(3);
//        Node1 tree2.left.left = new Node1(3);
//        Node1 tree2 = new Node1(3);
//
//
//    }
//}
//
//class Node1{
//
//    int data;
//    Node left;
//    Node right;
//
//    public Node1(int value){
//         right = null;
//         left = null;
//        data = value;
//    }
//}
