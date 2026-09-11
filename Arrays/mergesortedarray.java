import java.util.Arrays;

public class mergesortedarray {
     public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        System.out.println("Merge se pehle nums1: " + Arrays.toString(nums1));
        merge(nums1, m, nums2, n);
        System.out.println("Merge ke baad nums1:  " + Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
         int end1 = m-1;
         int end2=n-1;
         int newEnd = m+n-1;

        while(end2>=0){
            if(end2>=0 && nums1[end1]>nums2[end2]){
                nums1[newEnd]=nums1[end1];
                end1--;
            } else {
            nums1[newEnd] = nums2[end2];
            end2--;
        }
         newEnd--;
        }
    }


}
