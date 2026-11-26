package sorting;

public class insertionSort {
     public static void main(String[] args) {
        int[] arr = { 14, 9, 15, 12, 6, 8, 13 };
        sort(arr);
        for(int i=0; i<arr.length-1; i++){
        System.out.print(arr[i]+ " ");
        }
        
    }
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j=i+1; j< arr.length; j++ ){
                if(arr[i]>arr[j]){
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                }
            }
        }
    }
    
}
