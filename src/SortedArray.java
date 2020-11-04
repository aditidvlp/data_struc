//import javax.swing.tree.TreeNode;
//
//public class SortedArray {
//
//    public void sortedArrayToBST(int[] nums) {
//
//        Node root = null;
//        int i = nums[((nums.length - 1) + 1) / 2];
//
//        System.out.println("The root node is " + i);
//
//        root = i;
//
//        while (current != null || stack.size() > 0) {
//            while (current != null) {
//                stack.push(current);
//                current = current.left;
//            }
//
//            current = stack.pop();
//
//            System.out.println("The traversal elements are" + current.data);
//
//            current = current.right;
//
//        }
//    }
//
//
//
//    }
//
//    public  static void main(String S[]){
//
//        SortedArray bst = new SortedArray();
//        bst.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
//    }
//
//    class Node{
//
//        Node left;
//        Node right;
//        int data;
//
//        public Node(int value){
//            data = value;
//            left = null;
//            right = null;
//        }
//    }
//}
//
//
