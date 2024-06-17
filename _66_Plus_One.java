import java.util.ArrayList;

public class _66_Plus_One {
    public int[] plusOne(int[] digits) {
        int count = 0;
        for (int digit : digits) {
            if (digit == 9) {
                count++;
            }
        }
        if (count == digits.length) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < digits.length; i++) {
                arrayList.add(0);
            }
            arrayList.addFirst(1);
            return arrayList.stream().mapToInt(Integer::intValue).toArray();
        }
        int i = digits.length - 1;
        while (digits[i] == 9) {
            digits[i] += 1;
            if (digits[i] == 10) {
                digits[i] = 0;
                i--;
            }
        }
        digits[i]++;
        return digits;
    }
}
