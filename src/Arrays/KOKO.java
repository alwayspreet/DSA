package Arrays;

public class KOKO {
    public static void main(String[] args) {
        int[] piles={3,6,7,11};
        int h=8;
        int high=0;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        int low=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(totalhrs(piles,mid)<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        System.out.print(low);
    }
    static int totalhrs(int[] piles,int bananas){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            hours+=Math.ceil((double)piles[i]/bananas);

        }
        return hours;
    }
}
