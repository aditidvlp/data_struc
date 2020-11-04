//class Solution {
//    public List<Integer> addToArrayForm(int[] A, int K) {
//
//        StringBuilder res = new StringBuilder();
//
//        int[] array = new int[A.length];
//        int result = 0;
//
//
//        for(int i = 0; i < A.length - 1;i++){
//
//            result *= 10;
//            result += A[i];
//        }
//
//        int carry = 0;
//        String str1 = Integer.toString(result);
//        String str2 = Integer.toString(K);
//
//        int p1 = str1.length() - 1;
//        int p2 = str2.length() - 1;
//        while (p1 >= 0 || p2 >= 0) {
//            int x1 = p1 >= 0 ? str1.charAt(p1) - '0' : 0;
//            int x2 = p2 >= 0 ? str2.charAt(p2) - '0' : 0;
//            int value = (x1 + x2 + carry) % 10;
//            carry = (x1 + x2 + carry) / 10;
//            res.append(value);
//            p1--;
//            p2--;
//        }
//
//        if (carry != 0)
//            res.append(carry);
//
//        int finalValue = res.reverse.toString();
//
//        for(int i = 0; i < finalValue.length - 1; i++){
//
//            array[i] = res[i];
//        }
//
//        return array;
//    }
//}