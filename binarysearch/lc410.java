public class lc410 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int k =2;

System.out.println(splitArray(nums, k));

    }

    public static int splitArray(int[] nums, int k){
       int start = 0;
       int end = 0;

       for(int num : nums){
           start = Math.max(start, num);
           end += num;
       }

       while(start<end){
           int mid = start + (end-start)/2;
         if(isPossible(nums, k, mid)){
            end=mid;
         }else{
            start = mid+1;
         }
       }
       return start;
    } 

       public static boolean isPossible(int [] nums, int k, int capacity){
            int subArrayCount = 1;
             int subArrayLoad = 0;
        
            for (int num : nums) {
            if (subArrayLoad + num > capacity) { 
                subArrayCount++;
                subArrayLoad = 0;
            }
            subArrayLoad += num;
        }
        
        if(subArrayCount > k){
             return false;
            }else{
            return subArrayCount<= k;
            }
        

    }
    
}
