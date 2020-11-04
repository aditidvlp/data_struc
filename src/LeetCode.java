//import javax.swing.tree.TreeNode;
//import java.util.Arrays;
//import java.util.List;
//
//public class LeetCode {
//
//    class Solution {
//
//        public TreeNode bstFromPreorder(int[] preorder) {
//            return helper(Arrays.asList(preorder));
//        }
//
//        private TreeNode helper(List<Integer> li){
//            if(li.size() == 1)return new TreeNode(li.get(0));
//
//            List<Integer> le = new ArrayList<>();
//            List<Integer> ri = new ArrayList<>();
//
//            for(Integer i : li.toArray()){
//                if(i>li.get(0))ri.add(i);
//                else le.add(i);
//            }
//
//            TreeNode nd = new TreeNode(li.get(0));
//            nd.left = helper(le);
//            nd.right = helper(ri);
//
//            return nd;
//        }
//    }
//}
