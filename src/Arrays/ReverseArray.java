package Arrays;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={3,5,7,8,1};
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
      //  for (int i = 0; i < arr.length; i++) {
       //     System.out.print(arr[i]+" ");

       // }
        System.out.print(Arrays.toString(arr));
    }

    }

