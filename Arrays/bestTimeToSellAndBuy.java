
public class bestTimeToSellAndBuy {
    public static void main(String[] args) {
        int []arr = {7,5,3,6,4, 7};
System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int []arr){
        int maxProfit = 0;
        int minPrice =arr[0];

        for(int i = 0; i<arr.length; i++){
            int profit = 0;
            if(arr[i]<minPrice){
                minPrice = arr[i];
            }
            profit = arr[i]-minPrice;
            if(profit>maxProfit){
                maxProfit = profit;
            }

        }
        return maxProfit;
    }
}
