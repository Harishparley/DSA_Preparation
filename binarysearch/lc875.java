public class lc875 {
    public static void main(String[] args) {
        int [] piles = {805306368,805306368,805306368};
        int h = 1000000000;
       System.out.println(minEatingSpeed(piles, h));
    }

     public static int minEatingSpeed(int[] piles, int h) {
          int start = 1;
          int end = 1;
          for (int pile : piles) {
            end = Math.max(end, pile);
        }

          while (start<=end) {

            int mid = start + (end-start)/2;
            long hours = 0;
            for(int pile : piles){
                hours+=((long)pile + mid-1)/mid;
            }
            
            if(hours<=h){
             end=mid-1;
            }else{
                start = mid+1;
            }
            
          }
          return start ; 

    }

}
