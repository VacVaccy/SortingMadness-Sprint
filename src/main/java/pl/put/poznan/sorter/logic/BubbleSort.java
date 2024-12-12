package pl.put.poznan.sorter.logic;

/**
 * Class implementing the Bubble Sort algorithm.
 * <p>
 * The Bubble Sort algorithm works by repeatedly traversing the array,
 * comparing adjacent elements and swapping them if they are in the wrong order.
 * The elements are swapped "bubbly," meaning the largest element moves to the end of the array
 * after each full pass through the array.
 * </p>
 * <p>
 * Time complexity of the algorithm: O(n^2) in the worst case, O(n) in the best case,
 * when the array is already sorted.
 * </p>
 * 
 * @see Sorter
 */

public class BubbleSort implements Sorter {

    /**
     * Sorts an array of integers using the Bubble Sort algorithm.
     * <p>
     * The algorithm works by comparing adjacent elements and swapping them if they are in the wrong order.
     * It repeats this process until the array is sorted.
     * </p>
     * 
     * @param arr The array of integers to be sorted.
     * @return The sorted array of integers.
     */
    @Override
    public int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * Sorts an array of strings using the Bubble Sort algorithm.
     * <p>
     * The algorithm works by comparing adjacent elements and swapping them if they are in the wrong order.
     * It repeats this process until the array is sorted.
     * </p>
     * 
     * @param arr The array of strings (String) to be sorted.
     * @return The sorted array of strings (String).
     */
    @Override
    public String[] sort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * Returns the name of the sorting algorithm.
     * <p>
     * This method returns the name of the sorting algorithm, in this case, "Bubble sort", which is implemented
     * in this class.
     * </p>
     * 
     * @return The name of the sorting algorithm.
     */
    @Override
    public String getName() {
        return "Bubble sort";
    }
}
