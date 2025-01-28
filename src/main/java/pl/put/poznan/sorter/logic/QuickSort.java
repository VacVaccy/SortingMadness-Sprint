package pl.put.poznan.sorter.logic;

import java.util.Stack;

/**
 * Class implementing the Quick Sort algorithm.
 * <p>
 * The Quick Sort algorithm is a divide-and-conquer sorting algorithm. It works by selecting a pivot element,
 * partitioning the array into two subarrays such that elements less than the pivot are on one side and elements
 * greater than the pivot are on the other, and then recursively sorting the subarrays.
 * This implementation uses an iterative approach with a stack to avoid recursion.
 * </p>
 * <p>
 * Time complexity of the algorithm: O(n^2) in the worst case (when the pivot divides the array poorly),
 * O(n log n) in the average case.
 * </p>
 *
 * @see Sorter
 */

public class QuickSort implements Sorter {

    /**
     * Sorts an array of integers using the Quick Sort algorithm.
     * <p>
     * This implementation uses an iterative approach with a stack to manage subarrays instead of recursion.
     * A pivot is selected, and the array is partitioned into two subarrays around the pivot, which are then sorted.
     * </p>
     *
     * @param arr The array of integers to be sorted.
     * @return The sorted array of integers.
     */
    @Override
    public int[] sort(int[] arr) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0, arr.length - 1});

        while (!stack.isEmpty()) {
            int[] range = stack.pop();
            int left = range[0];
            int right = range[1];

            if (left >= right) {
                continue;
            }

            int pivot = partition(arr, left, right);

            stack.push(new int[]{left, pivot - 1});
            stack.push(new int[]{pivot + 1, right});
        }
        return arr;
    }

    /**
     * Partitions the array around a pivot element.
     * <p>
     * Elements less than or equal to the pivot are moved to the left, and elements greater than the pivot
     * are moved to the right.
     * </p>
     *
     * @param arr The array to be partitioned.
     * @param left The starting index of the subarray.
     * @param right The ending index of the subarray.
     * @return The index of the pivot after partitioning.
     */
    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            while (i <=j && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;

        return j;
    }

    /**
     * Sorts an array of strings using the Quick Sort algorithm.
     * <p>
     * This implementation uses an iterative approach with a stack to manage subarrays instead of recursion.
     * A pivot is selected, and the array is partitioned into two subarrays around the pivot, which are then sorted
     * lexicographically.
     * </p>
     *
     * @param arr The array of strings (String) to be sorted.
     * @return The sorted array of strings (String).
     */
    @Override
    public String[] sort(String[] arr) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0, arr.length - 1});
        while (!stack.isEmpty()) {
            int[] range = stack.pop();
            int left = range[0];
            int right = range[1];

            if (left >= right) {
                continue;
            }
            int pivot = partition(arr, left, right);
            stack.push(new int[]{left, pivot - 1});
            stack.push(new int[]{pivot + 1, right});
        }
        return arr;
    }

    /**
     * Partitions the array of strings around a pivot element.
     * <p>
     * Elements lexicographically less than or equal to the pivot are moved to the left,
     * and elements greater than the pivot are moved to the right.
     * </p>
     *
     * @param arr The array of strings to be partitioned.
     * @param left The starting index of the subarray.
     * @param right The ending index of the subarray.
     * @return The index of the pivot after partitioning.
     */
    private static int partition(String[] arr, int left, int right) {
        String pivot = arr[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {
            while (i <= j && arr[i].compareToIgnoreCase(pivot) <= 0) i++;
            while (i <= j && arr[j].compareToIgnoreCase(pivot) > 0) j--;

            if (i < j) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        String temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;

        return j;
    }

    /**
     * Returns the name of the sorting algorithm.
     * <p>
     * This method returns the name of the sorting algorithm, in this case, "Quick sort", which is implemented
     * in this class.
     * </p>
     *
     * @return The name of the sorting algorithm.
     */
    @Override
    public String getName() {
        return "Quick sort";
    }
}
