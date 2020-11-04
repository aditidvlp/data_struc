import java.util.*;

public class singleNumber {
    public int singleNumberMethod (int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int value = 0;
        for (int i = 0; i < nums.length; i++) {

            if (!map.containsKey(nums[i])) {
                value = 1;
                map.put(nums[i], value);
            } else {
                value = map.get(nums[i]);
                value += 1;
                map.put(nums[i], value);

            }
        }
        Map.Entry<Integer, Integer> min = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (min == null || min.getValue() > entry.getValue()) {
                min = entry;
            }
        }

//        int minKey = min.getKey();
//        System.out.println("The minimum key would be "+ minKey);

        return min.getKey();
    }




    public static void main(String S[]){

        singleNumber hello = new singleNumber();
        hello.singleNumberMethod(new int[]{4,2,1,2,1});
    }
}