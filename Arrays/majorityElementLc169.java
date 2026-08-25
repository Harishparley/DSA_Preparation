public class majorityElementLc169 {
    public static void main(String[] args) {
        int []arr = {2,2,1,2,1,1,1,2,2};
       System.out.println(majorityElement(arr)); 
    }

    public static int majorityElement(int[] arr) {
        int candidate = arr[0];
        int count =1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]==candidate){
                count++;
            }
            else {
                count--;
            }
            if(count==0){
                candidate =arr[i];
                count =1;
            }
        }
        return candidate;
    }
}

