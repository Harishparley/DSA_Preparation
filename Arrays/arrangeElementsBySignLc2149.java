import java.util.*;
public class arrangeElementsBySignLc2149 {
    public static void main(String[] args) {
        int [] arr = {3,2,-1,-5,6,-2,7,-9};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

    public static int[] rearrangeArray(int[] arr) {
         int pos = 0;
         int neg = 1;
         int [] result = new int[arr.length];
         for(int i = 0; i<arr.length; i++){
            if(arr[i]>0){
                result[pos]=arr[i];
                pos+=2;
            }else{
                result[neg]=arr[i];
                neg+=2;
            }

         }
        return result;
    }
}
