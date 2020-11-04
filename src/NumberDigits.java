class NumberDigits {
    public int findNumbers(int[] nums) {

        int[] array = new int[nums.length];
        int count = 0;
        int even = 0;

        for(int i =0; i < nums.length -1; i++) {

            while (nums[i] != 0) {
                ++count;
            }
        }
            for(int j = 0; j < nums.length -1;j++){
                array[j] = count;
            }

        for(int i = 0; i < array.length -1 ;i++){

            if(array[i] % 2 == 0){
                even++;
                System.out.println("The total even digits are " + even);

            }
        }
        return even;

    }

    public static void main(String S[]){

        NumberDigits digits = new NumberDigits();
        digits.findNumbers(new int[]{12,345,2,6,7896});
    }
}