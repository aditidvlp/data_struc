class SortParity {
    public void sortArrayByParity(int[] A) {


        int i = 0;
        int j = A.length;

        while(i > j){
            if(i % 2 != 0 && j % 2 == 0){
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
            }

            i++;
            j++;
        }
        System.out.println("The parity array is " + A[i]);

    }

    public static void main(String S[]){

        SortParity parity = new SortParity();
        parity.sortArrayByParity(new int[]{3,1,2,4});
    }
}

