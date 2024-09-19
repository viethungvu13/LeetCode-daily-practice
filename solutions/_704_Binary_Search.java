public class _704_Binary_Search {
    public int search(int[] nums, int target, int iLeft, int iRight) {
        if (iLeft > iRight)
            return -1;
        int iMid = (iLeft + iRight) / 2;
        if (nums[iMid] == target) {
            return iMid;
        } else if (nums[iMid] > target) {
            return search(nums, target, iLeft, iMid - 1);
        } else {
            return search(nums, target, iMid + 1, iRight);
        }

    }


    public int search(int[] a, int key) {
        int n = a.length;
        return search(a, key, 0, n - 1);
    }
}
