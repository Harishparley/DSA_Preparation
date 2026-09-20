public class infinite {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 9, 12, 45, 67, 72, 75, 79, 80, 89, 90 };
        int target = 45;
        System.out.println(searchInfiniteArray(arr, target));
    }

    public static int searchInfiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (end < arr.length && target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start =temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
