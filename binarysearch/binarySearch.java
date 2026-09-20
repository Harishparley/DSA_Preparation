public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { -22, -13, -5, 7, 9, 23, 56, 78, 88, 90, 123, 435, 900 };
    //    int[] arr = {900, 500, 456, 76, 34, 23, 12,8 };

        int target = 9;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[0] < arr[arr.length - 1];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isAsc == true) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }else{
                if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }

        }
        return -1;

    }
}
