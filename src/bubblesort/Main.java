package bubblesort;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 6, 5, 2, 8, 9, 4 };

        System.out.println("before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

       bubbleSort(nums);

        System.out.println();
        System.out.println("after sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static void bubbleSort(int[] nums) {
        // Bubble sort -> based on swapping the values
        // Simplest sorting algorithm that works by repeatedly swapping
        // the adjacent elements if they are in the wrong order.
        // This algorithm is not suitable for large data sets as its average
        // and worst-case time complexity is quite high

        // Traverse from left and compare adjacent elements and the higher one is
        // placed at right side
        // The largest element is moved to the rightmost end at first
        // Step is repeated until the data is sorted
        // https://www.geeksforgeeks.org/bubble-sort/

        int size = nums.length;
        int temp;
        boolean swapped;

        for (int i = 0; i < size - 1; i++) { // because last iteration contains only one number
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j+1]) {
                    temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }
            // if no elements are swapped during an inner loop
            // it means that the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
