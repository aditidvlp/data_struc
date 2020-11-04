public class ArrayAddresses {

    // method to calculate value of the array elements
    public void calcAddress(int base, int row_lb, int col_lb, int row_ub, int col_ub, int element_size) {

        //calculate the size of the row
        int n = col_ub - col_lb + 1;

        //printing the input statements
        System.out.println('\n');
        System.out.println("For this call: ");
        System.out.println("calcAddress("+base+", "+row_lb+", "+col_lb+", "+row_ub+", "+col_ub+", "+element_size+")");

        //printing the output statements
        System.out.println('\n');
        System.out.println("the output is");
        System.out.println("For array " +"a["+row_lb+":"+row_ub+","+col_lb+":"+col_ub+"] with element size " + element_size);

        for (int i = row_lb; i < row_ub + 1; i++) {
            for (int j = col_lb; j < col_ub + 1; j++) {
                //expression for computing array addresses for 2-dimensional array of any element size
                int location = base - (((row_lb * n) + col_lb) * element_size) + (((i * n) + j) * element_size);

                //printing the entire range of array elements and addresses
                System.out.println("a["+i+","+j+"] address = "+location);
            }

        }
    }
    public static void main(String S[]){

        //Instantiating the class and calling its calcAddress method
        ArrayAddresses calc = new ArrayAddresses();
        calc.calcAddress(1200, 0, 0,2 , 2, 1);
        calc.calcAddress(100,1,1,2,2,2);
        calc.calcAddress(100, 2, 3, 4,5,4);
        calc.calcAddress(100, -1, -1, 1, 2, 8);

    }

}
