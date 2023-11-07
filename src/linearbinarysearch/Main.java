package linearbinarysearch;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 5, 9, 16, 29, 36, 42, 58 };
        int target = 5;

        int result1 = linearSearch(nums, target);
        int result2 = binarySearch(nums, target);
        int result3 = recursiveBinarySearch(nums, target, 0, nums.length - 1);

        if (result1 != -1) {
            System.out.println("Index of the target1: " + result1);
            System.out.println("Index of the target2: " + result2);
            System.out.println("Index of the target3: " + result3);
        } else {
            System.out.println("Target not found");
        }
    }

    public static int recursiveBinarySearch(int[] nums, int target, int left, int right) {

        if(left <= right) {
            int mid = (left + right)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                return recursiveBinarySearch(nums, target, left, mid - 1);
            } else {
                return recursiveBinarySearch(nums, target, mid + 1, right);
            }
        }
        return -1;
    }

    // Time Complexity: O(logn)
    // Increases one step each time the number of elements is doubled
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int steps = 0;

        while(left <= right) {
            steps++;
            int mid = (left + right)/2;
            if (nums[mid] == target) {
                System.out.println("Steps for binary search: " + steps);
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Steps for binary search: " + steps);
        return -1;
    }


    // Time Complexity: O(n)
    // Time increases proportionally to the number of elements
    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i ++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps for linear search: " + steps);
                return i;
            }
        }
        System.out.println("Steps for linear search: " + steps);
        return -1;
    }
}
