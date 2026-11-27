package recursion;

public class factorial {
    public static void main(String[] args) {
        int ans = print(8);
        System.out.println(ans);
    }

    public static int print(int n){
        if(n==1){
            return 1;
        }
        int fac_nm1 = print(n-1);
        int fac_n = n*fac_nm1;
        return fac_n;
    }
}
