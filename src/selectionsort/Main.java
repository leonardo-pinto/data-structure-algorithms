package selectionsort;

public class Main {
    public static void main(String[] args) {

        int[] nums = { 6, 5, 2, 8, 9, 4 };
        int minIndex = -1;
        int maxIndex = -1;
        int temp;
        int size = nums.length;
        boolean swapped;

        System.out.println("before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Selection sort -> Swaps the min/max element in each outer iteration

        // Repeatedly selects the smallest (or largest) element from the unsorted
        // portion of the list and swaps it with the first element of the unsorted part
        // The process is repeated for the remaining unsorted portion until the entire list is sorted.
        // Time Complexity: O(n^2)

        // Minimum logic
        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        // Maximum logic
//        for (int i = 0; i < size - 1; i++){
//            maxIndex = 0;
//            for (int j = 1; j < size - i; j++) {
//                if(nums[j] > nums[maxIndex]) {
//                    maxIndex = j;
//                }
//            }
//            temp = nums[size - i - 1];
//            nums[size - i - 1] = nums[maxIndex];
//            nums[maxIndex] = temp;
//
//            System.out.println();
//            for (int num : nums) {
//                System.out.print(num + " ");
//            }
//        }

        System.out.println();
        System.out.println("after sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
