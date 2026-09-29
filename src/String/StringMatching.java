package String;
import java.util.Arrays;

public class StringMatching {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="cdab";
        String Pattern ="abcabcd";
        //System.out.print(IsRotation(s2,s1));
        System.out.print(Arrays.toString(Lpsarray(Pattern)));

    }
    public static boolean IsRotation(String s2,String s1){
        for (int i = 0; i < s2.length()-1; i++) {
            char ch=s1.charAt(0);
            s1= s1.substring(1)+ch;
            if(s1.equals(s2)) {
                return true;
            }
        }
            return false;
        }
     public static int[] Lpsarray(String str){
        int[] lps=new int[str.length()];
        int i=1;
        lps[0]=0;
        int l=0;


        while(i<str.length()){
            if(str.charAt(i)==str.charAt(l) ){
                l++;
                lps[i]=l;
                i++;}
            else {
                if(l!=0){
                    l=lps[l-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }

        }
        return lps;
    }

}
