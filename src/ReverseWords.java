import java.util.Stack;

class ReverseWords {

    private static boolean sixDominoes(int[] values, int a, int b)
    {
        int secondRow = a + b;
        int c = secondRow + 1;
        for (int i = 0; i < b; i++)
        {
            if (values[a + i] != values[c + i])
            {
                return false;
            }
        }
        return true;
    }

    private int DominoLength = 2;

    public static boolean solution(int[] values)
    {
        int lengthArr = values.length;

        int initial = 0;
        int current = 1;
        boolean result = true;
        while (result)
        {
            int initialLength = current * 2;


            if (initial + initialLength >= lengthArr)
            {
                break;
            }

            result = sixDominoes(values, initial, initialLength);
            initial += initialLength;
            current++;
        }

        return result;
    }

    public static void main(String S[]){
        int[] values = new int[] { 3, 4, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6 };
        System.out.println((values));
    }
}