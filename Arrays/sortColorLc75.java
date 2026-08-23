import java.util.Arrays;

public class sortColorLc75 {
    public static void main(String[] args) {
        int []arr = {1,2,0,2,3,0,1};
        sortColors(arr);
    }


    public static void sortColors(int[] arr) {

    int i = 0;
    int j = 0;
    int k = arr.length -1;

    while (j <= k) {

        if(arr[j]==0){
         int temp = arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
         i++;
         j++;

        }else if(arr[j]==1){
            j++;
        }else if(arr[j]==2){
            int temp1=arr[j];
            arr[j]=arr[k];
            arr[k]=temp1;
            k--;
        }

       
    }
    System.out.println(Arrays.toString(arr));
}
}
