public class _4_Median_of_Two_Sorted_Arrays {
    private static int[] merge(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        while (index < result.length) {
            if (index1 < nums1.length && index2 < nums2.length) {
                if (nums1[index1] < nums2[index2]) {
                    result[index] = nums1[index1];
                    index++;
                    index1++;
                } else {
                    result[index] = nums2[index2];
                    index++;
                    index2++;
                }
            } else {
                if (index1 < nums1.length) {
                    result[index] = nums1[index1];
                    index++;
                    index1++;
                } else if (index2 < nums2.length) {
                    result[index] = nums2[index2];
                    index++;
                    index2++;
                }
            }
        }
        return result;
    }

    private static double median(int[] nums) {
        int length = nums.length;
        if (length % 2 != 0) {
            return nums[length / 2];
        }
        return ((double)nums[length / 2] + (double)nums[(length / 2) - 1]) / 2;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return median(nums2);
        } else if (nums2.length == 0) {
            return median(nums1);
        }
        int[] mergedArray = merge(nums1, nums2);
        return median(mergedArray);
    }
}
