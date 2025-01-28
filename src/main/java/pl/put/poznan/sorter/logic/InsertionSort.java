package pl.put.poznan.sorter.logic;

/**
 * Class implementing the Insertion Sort algorithm.
 * <p>
 * The Insertion Sort algorithm works by building a sorted section of the array one element at a time.
 * It iterates through the array, picking an element, and inserting it into the correct position within the sorted section.
 * </p>
 * <p>
 * Time complexity of the algorithm: O(n^2) in the worst case, O(n) in the best case,
 * when the array is already sorted.
 * </p>
 *
 * @see Sorter
 */

public class InsertionSort implements Sorter{

    /**
     * Sorts an array of integers using the Insertion Sort algorithm.
     * <p>
     * The algorithm works by iterating through the array, taking one element at a time,
     * and inserting it into the correct position in the sorted section of the array.
     * </p>
     *
     * @param arr The array of integers to be sorted.
     * @return The sorted array of integers.
     */
    @Override
    public int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while(j >= 0 && key < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
        return arr;
    }

    /**
     * Sorts an array of strings using the Insertion Sort algorithm.
     * <p>
     * The algorithm iterates through the array, picking one string at a time and placing it in its correct position
     * among the previously sorted strings, comparing them lexicographically.
     * </p>
     *
     * @param arr The array of strings (String) to be sorted.
     * @return The sorted array of strings (String).
     */
    @Override
    public String[] sort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && key.compareToIgnoreCase(arr[j]) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    /**
     * Returns the name of the sorting algorithm.
     * <p>
     * This method returns the name of the sorting algorithm, in this case, "Insertion sort", which is implemented
     * in this class.
     * </p>
     *
     * @return The name of the sorting algorithm.
     */
    @Override
    public String getName() {
        return "Insertion sort";
    }
}
