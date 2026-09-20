public abstract class lc1482 {


    public static void main(String[] args) {
        int [] bloomDay ={7,7,7,7,12,7,7};
        int k=3;
        int m =2;
        System.out.println(minimumDays(bloomDay, m, k));
        
    }

    
    public static int minimumDays(int[] bloomDay, int m, int k) {
       
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int start=1;
        int end= 0;

        for (int day : bloomDay) {
            start = Math.min(start, day);
            end = Math.max(end, day);
        }

        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (canMakeBouquets(bloomDay, m, k, mid)) {
                result = mid;
                end = mid - 1; 
            } else {
                start = mid + 1;  
            }
        }

        return result;
    }

    public static boolean canMakeBouquets(int[] bloomDay, int m, int k, int currentDay) {
        int bouquetCount = 0;
        int adjacentFlowers = 0;

        for (int day : bloomDay) {
            if (day <= currentDay) {
                adjacentFlowers++;
                if (adjacentFlowers == k) {
                    bouquetCount++;
                    adjacentFlowers = 0; 
                }
            } else {
                adjacentFlowers = 0;
            }
        }

        return bouquetCount >= m;
    }
}
