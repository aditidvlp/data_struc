import java.util.*;

class ExtraCandies {

    public static int solution(String s){
        // codility

        int l = s.length();
        int ret = 0;
        for(int i = 0;i<l;i++){
            String st = s.substring(i, l);

            for(int j = 0;j<st.length();j++){

                String ss = st.substring(0,j+1);
                int [] ch = new int[26];

                for(char c:ss.toCharArray()){
                    ch[c - 'A']++;
                }
                for(int k = 0; k<26;k++){
                    if(ch[k] == 1)ret++;
                }
            }
        }

        return ret;
    }

    public static void main(String S[]){
        System.out.println(solution("ACAX"));

    }
}