import java.util.HashSet;

public class longestconsecutivesequence {
    public static void main(String[] args) {
        int[] nums = { 100, 1, 200, 2, 2, 3, 4, 5 };
        System.out.println(searchNew(nums));
    }

    public static int searchNew(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int maxlength = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                maxlength = Math.max(maxlength, count);
            }

        }

        return maxlength;
    }

    // public static int search(int[]arr){
    // int count=1;
    // Arrays.sort(arr);
    // int maxCount=0;
    // for(int i = 0; i<arr.length-1; i++){
    // if(arr[i]+1==arr[i+1]){
    // count ++;
    // maxCount=Math.max(maxCount, count);
    // }else if(arr[i+1]==arr[i]){

    // }
    // else{
    // count = 1;
    // }
    // }
    // return maxCount;
    // }
}
