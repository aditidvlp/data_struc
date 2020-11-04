class Grid {
    public void countNegatives(int[][] grid) {

        int n = 0;
        int m = grid.length ; // counting number of rows
        int count = 0;

            for (int l = 0; l < m; l++) {
                for (int k = 0; k < m; k++) {
                    if (grid[l][k] < 0) {
                        count++;
                    }
                }
            }

       // return count;
        System.out.println(count);

    }

    public static void main(String S[]){

        Grid negative = new Grid();
        negative.countNegatives(new int[][]{{5,1,0},{-5,-5,-5}});
    }
}
    

