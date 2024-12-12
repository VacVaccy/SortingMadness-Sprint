package pl.put.poznan.sorter.logic;

/**
 * Class implementing the Heap Sort algorithm.
 * <p>
 * The Heap Sort algorithm is based on a data structure called a heap, which is a special type of binary tree.
 * The sorting process involves treating the array as a heap, then first building a max-heap (where each parent 
 * is greater than or equal to its children), and subsequently transforming the heap into a sorted array.
 * </p>
 * <p>
 * Time complexity of the algorithm: O(n log n) both in the worst and best case.
 * </p>
 * 
 * @see Sorter
 */

public class HeapSort implements Sorter {
    
    /**
     * Sorts an array of integers using the Heap Sort algorithm.
     * <p>
     * The sorting process involves two main phases:
     * 1. Building a max-heap from the array.
     * 2. Swapping the root of the heap with the last element of the array, then restoring the heap property.
     * </p>
     * 
     * @param arr The array of integers to be sorted.
     * @return The sorted array of integers.
     */
    public int[] sort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
        return arr;
    }

    /**
     * Restores the max-heap property in the array.
     * <p>
     * This method ensures that the binary tree satisfies the max-heap condition, i.e., the value of each node
     * is greater than or equal to the values of its children.
     * </p>
     * 
     * @param arr The array representing the heap.
     * @param n The size of the array.
     * @param i The index of the element to be heapified.
     */
    private void heapify(int[] arr, int n, int i) {
        int max = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[max]) {
            max = left;
        }
        
        if (right < n && arr[right] > arr[max]) {
            max = right;
        }

        if (max != i) {
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            heapify(arr, n, max);
        }
    }


    /**
     * Sorts an array of strings using the Heap Sort algorithm.
     * <p>
     * This works similarly to sorting integers, but the comparisons are made between strings. 
     * As with the integer sorting, a heap is built first, and then the array is sorted.
     * </p>
     * 
     * @param arr The array of strings to be sorted.
     * @return The sorted array of strings.
     */
    @Override
    public String[] sort(String[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            String temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }

        return arr;
    } 

    /**
     * Restores the max-heap property for an array of strings.
     * <p>
     * This method ensures that the binary tree satisfies the max-heap condition for string comparisons,
     * i.e., each node's value (string) is greater than or equal to the values of its children in lexical order.
     * </p>
     * 
     * @param arr The array of strings representing the heap.
     * @param n The size of the array.
     * @param i The index of the element to be heapified.
     */
    private void heapify(String[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left].compareTo(arr[largest]) > 0) {
            largest = left;
        }

        if (right < n && arr[right].compareTo(arr[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            String swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    /**
     * Returns the name of the sorting algorithm.
     * <p>
     * This method returns the name of the sorting algorithm, in this case, "Heap sort", which is implemented
     * in this class.
     * </p>
     * 
     * @return The name of the sorting algorithm.
     */
    @Override
    public String getName() {
        return "Heap sort";
    }
}
