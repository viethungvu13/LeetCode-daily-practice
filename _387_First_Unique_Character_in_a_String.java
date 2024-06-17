public class _387_First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[123];
        for (char c : arr) {
            count[c]++;
        }

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (count[c] == 1) {
                return i;
            }
        }
        return -1;
    }
}
