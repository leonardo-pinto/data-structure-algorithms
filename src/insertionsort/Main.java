package insertionsort;

public class Main {
    public static void main(String[] args) {

        int[] nums = { 6, 5, 2, 8, 9, 4 };
        int size = nums.length;
        int key;
        int j;

        System.out.println("before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Insertion sort -> checks a value with the sorted portion of the array
        // Time Complexity: O(n^2)
        // Initially considers that the first element is sorted, so starts with the second
        for (int i = 1; i < size; i++) {
            key = nums[i]; // element to be sorted in this iteration
            j = i - 1;

            // move elements that are greater than the key
            // to one position ahead of their current position
            while(j >= 0 && nums[j] > key) {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1] = key;

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
