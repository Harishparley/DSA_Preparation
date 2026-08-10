package Array;

public class seclargest {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,2,2,2,9, 7};
        
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
              seclargest = largest;
              largest = arr [i];
            }else if(arr[i]<largest && arr[i]>seclargest){
                seclargest = arr[i];
            }

             if (seclargest == Integer.MIN_VALUE) {
             System.out.println("seclargest not exist");
            }
        }

        System.out.println(largest);
        System.out.println(seclargest);

    }
}
