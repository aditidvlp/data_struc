class findPivot {
    public int pivotIndex(int[] nums) {

        int leftsum = 0;
        int rightsum = 0;
        int initial = 0;
        int i,j;

        int[] array1 = new int[nums.length];
        int[] array2 = new int[nums.length];

        for(i = 0; i < nums.length ;i++){


            leftsum += nums[i];
            array1[i] = leftsum;

            System.out.println("The first array is " + array1[i]);
        }

        for(j = nums.length-1; j >= 0; j--){

            rightsum += nums[j];
            array2[j] = rightsum;
            System.out.println("The second array is "+array2[j]);
        }

        for(int k = 0; k < array1.length;k++){

            for(int l = array2.length-1; l >= 0; l--){

                if(array1[k] == array2[l]){

                    return k;

                }
            }
        }
        return -1;

    }

    public static void main(String S[]){

        findPivot pivot = new findPivot();
        pivot.pivotIndex(new int[]{1,7,3,6,5,6});
    }
}