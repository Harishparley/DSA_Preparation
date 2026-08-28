import java.util.Arrays;

public class longestconsecutivesequence {
    public static void main(String[] args) {
        int []arr={100, 1,200,2,2,3,4,5};
       System.out.println(search(arr)); 
    }
    public static int search(int[]arr){
        int count=1;
        Arrays.sort(arr);
        int maxCount=0;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]+1==arr[i+1]){
                count ++;
            maxCount=Math.max(maxCount, count);
            }else if(arr[i+1]==arr[i]){

            }
            else{
                count = 1;
            }
            
        }
        return maxCount;
    }
}
