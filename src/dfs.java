

import java.util.Stack;

class Node{

    Node left;
    Node right;
    int data;

    public Node(int value){
        data = value;
        left = null;
        right = null;
    }
}
 class dfs {

     Node root;

     void inOrder() {
         if (root == null)
             return;

         Stack<Node> stack = new Stack<Node>();
         Node current = root;

         while (current != null || stack.size() > 0) {
             while (current != null) {
                 stack.push(current);
                 current = current.left;
             }

             current = stack.pop();

             System.out.println("The traversal elements are" + current.data);

             current = current.right;

         }
     }

    public static void main(String args[]){

        dfs d = new dfs();
        d.root = new Node(1);
        d.root.left = new Node(2);
        d.root.right = new Node(3);
        d.root.left.left = new Node(4);
        d.root.left.right = new Node(5);
        d.inOrder();




    }

}


