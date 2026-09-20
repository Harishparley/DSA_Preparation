public class lc2187 {
    public static void main(String[] args) {
        int []time = {1,2,3};
        int totalTrips = 5;
        System.out.println(minimumTime(time, totalTrips));
    }
    public static long minimumTime(int[] time, int totalTrips) {
        long start = time[0];
        for(int t : time){
            start = Math.min(start, t);
        }

        long end = start * totalTrips;

        while(start<end){
          long mid = start + (end-start)/2;
          if(isPossible(time, totalTrips, mid)){
            end = mid;
          }else{
            start = mid + 1;
          }
        }
        return start;

    } 

    public static boolean isPossible(int []time, int totalTrips, long minTime){
       
        long totalTripsCalculated = 0;

        for(int t: time){
            totalTripsCalculated += minTime/t;

             if(totalTripsCalculated>=totalTrips){
             return true;
            }
        }

        return false;
    }
    
}
