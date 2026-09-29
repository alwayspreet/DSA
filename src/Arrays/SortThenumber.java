package Arrays;
import java.util.Arrays;

public class SortThenumber {
    public static void main(String[] args) {
        int[] nums={2,1,2,0,1,0,1,2};
        Sort(nums);


        System.out.print(Arrays.toString(nums));
    }
    static void Sort(int[] arr){
        int mid=0;
        int low=0;
        int high=arr.length-1;
        while(mid<=high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else  {
                int swap = arr[high];
                arr[high] = arr[mid];
                arr[mid] = swap;
                high--;
            }

        }

    }
    public static void Sorting(int[] Arr){
        int c1=0;
        int c2=0;
        int c3=0;
        for(int i=0;i< Arr.length;i++) {
            if (Arr[i] == 0) {
                c1++;
            } else if (Arr[i] == 1) {
                c2++;
            } else {
                c3++;
            }
        }

        for( int j=0;j<c1;j++){
            Arr[j]=0;
        }

        for(int k=c1;k<c2+c1;k++){
            Arr[k]=1;
        }
        for(int h=c1+c2;h<Arr.length;h++){
            Arr[h]=2;
        }

    }
}
