public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public int findNumbers(int[] nums) {

        int count = 0;

        for (int a : nums) {
            int soLuongChuSo = tinhSoChuSo(a);
            if (soLuongChuSo % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    private int tinhSoChuSo(int a) {

        int result = a;
        int count = 0;
        while (result != 0) {
            result = a / 10;
            a = result;
            count++;
        }

        return count;
    }
}
