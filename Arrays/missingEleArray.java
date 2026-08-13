public class missingEleArray {
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5,6,7,8,10};
        int N = 10;
        int summation = (N*(N+1))/2;
        int sum = arr[0];

        for(int i =1; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(summation-sum);
    }
}
