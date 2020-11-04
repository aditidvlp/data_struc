//import javax.swing.tree.TreeNode;
//import java.util.LinkedList;
//import java.util.List;
//
//class RangeSumofBST {
//    public int rangeSumBST(TreeNode root, int L, int R) {
//
//        int sum = 0;
//
//        List<TreeNode> list = new LinkedList<>();
//        list.add(root);
//
//        System.out.println("The node would be " + list);
//
//        for(int i = 0; i < root.length -1;i++){
//
//            if(root[i] >= L && root[i] <= R){
//
//                sum += root[i];
//            }
//
//        }
//        return sum;
//
//
//    }
//
//    public static void main(String S[]){
//
//        RangeSumofBST prac = new RangeSumofBST();
//        prac.rangeSumBST([10,5,15,3,7,null,18], 7, 15);
//    }
//}