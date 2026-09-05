import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeInterval {

    public static int[][] merge(int[][] intervals) {
         
         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
         List<int[]> result = new ArrayList<>(); 

         int[] currentArr = intervals[0];
        result.add(currentArr);

         for(int i =0; i<=intervals.length-1; i++){

            int[] nextArr = intervals[i];

            if (nextArr [0] <= currentArr[1]) {
                currentArr[1] = Math.max(currentArr[1], nextArr [1]);
            } else {
                currentArr = nextArr ;
                result.add(currentArr);
            }
         }
         return result.toArray(new int[result.size()][]);
    }
}
 
