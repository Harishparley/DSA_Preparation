public class maxCustomerWealthLc1672{
    public static void main(String[] args) {
        int [][] account = {
            {1,2,3},
            {4,2,1,5}
        };

        System.out.println(maximumWealth(account));
    }

    public static  int maximumWealth(int[][] accounts) {
        int maxSum=0;
        for(int i=0; i<accounts.length; i++){
            int sum =0;
            for(int j=0; j<accounts[i].length; j++){
               sum += accounts[i][j];
            }
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        return maxSum;
    }
}