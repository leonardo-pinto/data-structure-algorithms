package insertionsort;

public class Main {
    public static void main(String[] args) {

        int[] nums = { 6, 5, 2, 8, 9, 4 };
        int size = nums.length;
        int key;
        int j;
        System.out.println("Insertion Sort");
        System.out.println("before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Insertion sort -> Works similar to the way you sort playing cards in your hands
        // The array is virtually split into a sorted and an unsorted parte.
        // Values from the unsorted part are picked and placed at the correct position
        // Time Complexity: O(n^2)
        // Initially considers that the first element is sorted, so starts with the second
        for (int i = 1; i < size; i++) {
            key = nums[i]; // element to be sorted in this iteration
            j = i - 1; // last sorted element

            // move elements that are greater than the key
            // to one position ahead of their current position
            while(j >= 0 && nums[j] > key) {
                nums[j+1]=nums[j];
                j--;
            }
            // since j is the last number that is less than the key,
            // we add the key to the j + 1 index
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
