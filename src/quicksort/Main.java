package quicksort;

public class Main {
    public static void main(String[] args) {

        int[] nums = { 6, 5, 2, 8, 9, 4 };

        System.out.println("before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // https://www.geeksforgeeks.org/quick-sort/
        // Quick sort -> Divide and Conquer algorithm that picks an element as a pivot
        // and partitions the given array around the picked pivot by placing the pivot
        // in its correct position in the sorted array

        // The key process in quickSort is a partition(). The target of partitions is to place
        // the pivot at its correct position in the sorted array and pull the smaller elements
        // to the left of the pivot, and all greater elements to the right of the pivot

        // Partition is done recursively on each side of the pivot after the pivot is placed
        // in its correct position and this finally sorts the array
        // Time Complexity: O(n^2)
        // Best Case: O(nlog(n)) -> when the pivot chosen at each step
        // divides the array into equal halves
        quickSort(nums, 0, nums.length - 1);

        System.out.println();
        System.out.println("after sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    // As the partition process is done recursively, it keeps on putting the pivot in its actual
    // position in the sorted array. Repeatedly putting pivots in their actual position makes the
    // array sorted
    private static void quickSort(int[] nums, int low, int high){
        System.out.println(low + " " + high);
        if (low < high) {

            // pi is the index of the pivot
            int pi = partition(nums, low, high);
            quickSort(nums, low, pi-1); // the smaller portions ends just before the pivot position
            quickSort(nums, pi+1, high); // the higher portion starts just after the pivot position
        }
    }

    // Start from the leftmost element and keep track of the index of smaller (or equal) elements as i
    // While transversing, if we find a smaller element, we swap the current element with arr[i].
    // Otherwise, we ignore the current element

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        int temp;

        for (int j = low; j < nums.length; j++) {
            if (nums[j] < pivot) {
                // increment i index to perform the swap
                i++;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;
        return i + 1; //return the correct position of the pivot
    }

//    private static void quickSort(int[] nums, int low, int high) {
//        if (low < high) {
//            int pi = partition(nums, low, high);
//            quickSort(nums, low, pi - 1);
//            quickSort(nums, pi + 1, high);
//        }
//    }
//
}
