//better approach as a developer 

// class Solution {
//     public int shipWithinDays(int[] weights, int days) {
//         int low = 0;
//         int high = 0;
        
//         for (int w : weights) {
//             low = Math.max(low, w);
//             high += w;
//         }
        
//         // Binary search on capacity
//         while (low < high) {
//             int mid = low + (high - low) / 2;
            
//             if (canShip(weights, days, mid)) {
//                 high = mid; // Try finding a smaller feasible capacity
//             } else {
//                 low = mid + 1; // Capacity too small, increase it
//             }
//         }
        
//         return low;
//     }
    
//     private boolean canShip(int[] weights, int days, int capacity) {
//         int daysNeeded = 1;
//         int currentLoad = 0;
        
//         for (int w : weights) {
//             if (currentLoad + w > capacity) {
//                 daysNeeded++;
//                 currentLoad = 0;
//             }
//             currentLoad += w;
//         }
        
//         return daysNeeded <= days;
//     }
// }



class lc1011 {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (canShip(weights, days, mid)) {
                high = mid; 
            } else {
                low = mid + 1; 
            }
        }
        
        return low;
    }
    
    private boolean canShip(int[] weights, int days, int capacity) {
        int daysNeeded = 1;
        int currentLoad = 0;
        
        for (int w : weights) {
            if (currentLoad + w > capacity) { 
                daysNeeded++;
                currentLoad = 0;
            }
            currentLoad += w;
        }
        
        return daysNeeded <= days;
    }
}






