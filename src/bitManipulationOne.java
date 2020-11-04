public class bitManipulationOne {

     public void hammingDistance(int x, int y) {

        String xBinary = Integer.toBinaryString(x);
        String yBinary = Integer.toBinaryString(y);


        System.out.println("The x is " + xBinary);
        System.out.println("The y is " + yBinary);
    }

    public static void main(String S[]){

         bitManipulationOne var = new bitManipulationOne();
         var.hammingDistance(1,4);
    }
}



