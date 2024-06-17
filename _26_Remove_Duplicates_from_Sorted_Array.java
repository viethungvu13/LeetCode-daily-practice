import java.util.ArrayList;

public class _26_Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (!arrayList.contains(nums[i])) {
                arrayList.add(nums[i]);
                count++;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            nums[i] = arrayList.get(i);
        }
        return count;
    }
}
