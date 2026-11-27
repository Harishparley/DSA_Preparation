package recursion;

public class printSumOfNaturalnum {
    public static void main(String[] args) {
        print(0, 5, 0);
    }

    public static void print(int i, int n, int sum){
        if(i==n){
         sum+=i;
         System.out.println(sum);
         return ;
        }
        sum+=i;
        i++;
        print(i, n, sum);
        System.out.println(i);
    }
}
