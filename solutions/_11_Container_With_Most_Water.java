public class _11_Container_With_Most_Water {
    private int min(int a, int b) {
        if (a <= b) return a;
        return b;
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;

        int area = 0;
        while (left < right) {
            int w = min(height[left], height[right]);
            int h = right - left;
            int area_temp = w * h;
            
            if (area_temp > area) {
                area = area_temp;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return area;
    }
}
