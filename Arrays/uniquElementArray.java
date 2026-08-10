package Array;

public class uniquElementArray {
    public static void main(String[] args) {
        int []arr = {1,1,2,2,2,3,3,4,4,5,5,6};

        int i = 0;
        for(int j=1; j<arr.length; j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println(i+1);
    }
}
