package Arrays;
import java.util.Arrays;


public class Nextpermutation {
    public static void main(String[] args) {
        int[] nums={4,5,3,2,1};
        int idx=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            int a=0;
            int b=nums.length-1;
            while(a<b){
                int temp=nums[a];
                nums[a]=nums[b];
                nums[b]=temp;
                a++;
                b--;
            }
        }
        else{
            for(int j=nums.length-1;j>idx;j--){
                if(nums[j]>nums[idx]){
                    int swap=nums[idx];
                    nums[idx]=nums[j];
                    nums[j]=swap;
                    break;
                }
            }
            int x=idx+1;
            int y=nums.length-1;
            while(x<y){
                int var=nums[x];
                nums[x]=nums[y];
                nums[y]=var;
                x++;
                y--;
            }
        }
        System.out.print(Arrays.toString(nums));
    }
}
