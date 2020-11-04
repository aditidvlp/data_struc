import java.util.*;

class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] - 1 * nums[nums.length - 1] - 1, nums[nums.length - 1] - 1 * nums[nums.length - 1] - 2);
    }
    public static  void main(String []args){
        int [][] grid = new int[][]{
                {1,0,1},{0,1,1},{1,1,1},{1,0,1}
        };
        System.out.println(countCornerRectangles(grid));
    }

    static int x1,y1,x2,y2,x3,y3,x4,y4;
    static int w , h;
    static int ret;
    static int [][] col;
    static int [][] cnt;

    public static int countCornerRectangles(int[][] grid) {
        Map<String, Integer> mp = new HashMap<>();
        w = grid[0].length;h = grid.length; ret = 0;
        cnt = new int[h][w];

        List<Integer> li;
        StringBuilder indx;
        for (int i = 0;i < h;i++){
            li = new LinkedList<>();
            for (int j = 0;j< w;j++){
                if (grid[i][j] == 1){
                    for (int k = 0;k < li.size();k++){
                        indx = new StringBuilder();
                        indx.append(li.get(k).toString());
                        indx.append(j);
                        mp.put(indx.toString(), mp.getOrDefault(indx.toString(), -1) + 1);
                    }
                    li.add(j);
                }
            }
        }

        for(int i: mp.values()){
            ret+=i;
        }
            return ret;
    }
    static private void deep(int x,int y, int d){
        if(d == 2){
            for(int i = x+1; i < w;i++){
                if(col[y][i] == 1){
                    x2 = i;y2 = y;
                    deep(i, y, 3);
                }
            }
        }else if(d == 3){
            for(int j = y+1;j<h;j++){
                if(col[j][x] == 1){
                    x3 = x;y3 = j;
                    deep(x, j, 4);
                }
            }
        }else if(d == 4){
                if(col[y][x1] == 1){
                    x4 = x1; y4 = y;
                    ret+=1;
                }
        }
        return;
    }
}