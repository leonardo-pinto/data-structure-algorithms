package mergesort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 8, 9, 4};

        System.out.println("Merge Sort");
        System.out.println("before sorting");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        mergeSort(arr, 0, arr.length - 1);

        // Works by dividing an array into smaller subarrays, sorting each subarray,
        // and then merging the sorted subarray back together to form the final sorted array

        // The process of merge sort is to divide the array into two halves
        // sort each half, and then merge the sorted halves back together.

        System.out.println();
        System.out.println("after sorting");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);

            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = (mid-l+1);
        int n2 = (r-mid);

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(int x = 0; x < n1; x++) {
            leftArr[x] = arr[l+x];
        }

        for(int x = 0; x < n2; x++) {
            rightArr[x] = arr[mid+1+x];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i<n1 && j<n2) {
            if(leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
