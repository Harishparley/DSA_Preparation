// import java.util.*;
// public class lc1552 {
//     public static void main(String[] args) {
//         int []position = {1,2,3,4,7};
//         int m =3;
    
//     }

//     public int maxDistance(int[] position, int m) {
//         int start = 1;
//         for(int i = 0; i<position.length; i++){
//             if(position[i]>position[i+1]){
//                 Arrays.sort(position);
//             }else{
//                 int end = position.length - start;
//             }
//         }
        
//     }

//     public static boolean isPossible(int []position, int m, int minDistance){
           
//     }
// }



import java.util.Arrays;

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        
        int start = 1; 
        int end = position[position.length - 1] - position[0];
        int result = 0;

        while (start <= end) {
            int mid = start + (end- start) / 2;

            if (canPlaceBalls(position, m, mid)) {
                result = mid; 
                start = mid + 1; 
            } else {
                end = mid - 1; 
            }
        }

        return result;
    }

    public static boolean canPlaceBalls(int[] position, int m, int minDist) {
        int ballsCount = 1;
        int lastPos = position[0];

        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastPos >= minDist) {
                ballsCount++;
                lastPos = position[i]; 
                
\                if (ballsCount == m) {
                    return true;
                }
            }
        }

        return ballsCount>= m;
    }
}
