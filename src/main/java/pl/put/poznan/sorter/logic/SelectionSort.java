package pl.put.poznan.sorter.logic;

/**
 * Class implementing the Selection Sort algorithm.
 * <p>
 * The Selection Sort algorithm works by dividing the array into a sorted and an unsorted part.
 * The smallest (or largest, depending on the order) element from the unsorted part is selected
 * and swapped with the leftmost element of the unsorted part, effectively growing the sorted portion.
 * </p>
 * <p>
 * Time complexity of the algorithm: O(n^2) in all cases, as it always performs the same number of comparisons,
 * regardless of the initial arrangement of elements.
 * </p>
 *
 * @see Sorter
 */
public class SelectionSort implements Sorter {

    /**
     * Sorts an array of integers using the Selection Sort algorithm.
     * <p>
     * The algorithm selects the smallest element from the unsorted portion of the array
     * and swaps it with the leftmost unsorted element. This process is repeated for all elements.
     * </p>
     *
     * @param arr The array of integers to be sorted.
     * @return The sorted array of integers.
     */
    @Override
    public int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_id = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_id]) {
                    min_id = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_id];
            arr[min_id] = temp;
        }
        return arr;
    }

    /**
     * Sorts an array of strings using the Selection Sort algorithm.
     * <p>
     * The algorithm selects the lexicographically smallest string from the unsorted portion of the array
     * and swaps it with the leftmost unsorted element. This process is repeated for all elements.
     * </p>
     *
     * @param arr The array of strings (String) to be sorted.
     * @return The sorted array of strings (String).
     */
    @Override
    public String[] sort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_id = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareToIgnoreCase(arr[min_id]) < 0) {
                    min_id = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[min_id];
            arr[min_id] = temp;
        }
        return arr;
    }

    /**
     * Returns the name of the sorting algorithm.
     * <p>
     * This method returns the name of the sorting algorithm, in this case, "Selection sort", which is implemented
     * in this class.
     * </p>
     *
     * @return The name of the sorting algorithm.
     */
    @Override
    public String getName() {
        return "Selection sort";
    }
}
