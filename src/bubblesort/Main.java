package bubblesort;

public class Main {
    public static void main(String[] args) {

        int[] nums = { 6, 5, 2, 8, 9, 4 };
        int temp;

        System.out.println("before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Bubble sort -> based on swapping the values
        // Nested loop based on the size of the array
        // Time Complexity: O(n^2)
        for (int i = 0; i < nums.length; i++) {
            // since the last(i) position is sorted already
            // nums.length - i -1
            for (int j = 0; j < nums.length - i- 1; j++) {
                if (nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.println();

            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
        System.out.println("after sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
