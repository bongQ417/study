package leecode;

/**
 * @author plw on 2021/5/12 9:08 AM.
 * @version 1.0
 */
public class Solution004 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLen = nums1.length + nums2.length;
        int forwardMiddle = -1;
        int middle = -1;
        int i = 0, j = 0, k = 0;
        for (; k <= totalLen / 2; k++) {
            forwardMiddle = middle;
            if (i < nums1.length && (j >= nums2.length || nums1[i] < nums2[j])) {
                middle = nums1[i];
                i++;
            } else {
                middle = nums2[j];
                j++;
            }
        }
        return (totalLen % 2) == 0 ? (forwardMiddle + middle) / 2.0 : middle;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
