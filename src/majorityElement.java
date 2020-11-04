//import java.util.Collections;
//import java.util.HashMap;
//
//public class majorityEle {
//
//    public int majorityElement(int[] nums) {
//
//        int count = nums.length/2;
//        System.out.println("The count is " +count);
//        int value = 0;
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for(int i = 0; i < nums.length; i++){
//            if(!map.containsKey(nums[i]))   {
//                value = 1;
//            }
//            else{
//
//                value = map.get(nums[i]);
//                value += 1;
//            }
//            map.put(nums[i], value);
//        }
//
//        int maxValueInMap=(Collections.max(map.values()));
//
//        return nums[maxValueInMap];
//
//    }
//
//    public static void main(String S[]){
//
//        majorityEle hello = new majorityEle();
//        majorityEle.t
//    }
//}