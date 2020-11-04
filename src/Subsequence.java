class Subsequence {
    public void findLengthOfLCIS(int[] nums) {

        int count = 0;

        for(int i = 0; i < nums.length - 1;i++){

            if(nums[i] > nums[i+1]){

                count = count +1;
                System.out.println("The count is now " + count);
            }
        }
        //System.out.println("The longest subsequence would be "+count);

    }

    public static void main(String S[]){

        Subsequence sequence = new Subsequence();
        sequence.findLengthOfLCIS(new int[]{1,3,5,4,7});
    }
}