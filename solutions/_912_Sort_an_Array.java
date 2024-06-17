public class _912_Sort_an_Array {
     public int[] merge(int[] array_1, int[] array_2) {

          // Merge
          int size_results = array_1.length + array_2.length;
          int[] results = new int[size_results];
          int index = 0, index_1 = 0, index_2 = 0;
          while (index < size_results) {
               if (index_1 < array_1.length && index_2 < array_2.length) {
                    if (array_1[index_1] < array_2[index_2]) {
                         results[index] = array_1[index_1];
                         index_1++;
                         index++;
                    } else {
                         results[index] = array_2[index_2];
                         index_2++;
                         index++;
                    }
               } else {
                    if (index_1 < array_1.length) {
                         results[index] = array_1[index_1];
                         index_1++;
                         index++;
                    } else  if (index_2 < array_2.length) {
                         results[index] = array_2[index_2];
                         index_2++;
                         index++;
                    }
               }
          }
          return results;
     }
     
     public int[] mergeSort(int[] array, int left, int right) {
          // Special case
          // Stop conditions
          if (left == right) {
               return new int[]{array[left]};
          }
     
          // Divide
          int mid = (left + right) / 2;
          int[] array_1 = mergeSort(array, left, mid);
          int[] array_2 = mergeSort(array, mid + 1, right);

          // Merge
          return merge(array_1, array_2);
     }

     public int[] sortArray(int[] nums) {
          return mergeSort(nums, 0, nums.length - 1);
     }
}
