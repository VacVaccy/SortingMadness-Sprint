package pl.put.poznan.sorter.logic;

/**
 * Class implementing the Shell Sort algorithm.
 * <p>
 * The Shell Sort algorithm is a generalization of the insertion sort that allows the exchange
 * of far-apart elements. The algorithm starts by sorting elements far apart from each other
 * and progressively reduces the gap between elements to be compared.
 * </p>
 * <p>
 * Time complexity of the algorithm: Depends on the gap sequence. Using the original gap sequence
 * (n/2, n/4, ..., 1), the time complexity is O(n^2) in the worst case. With better gap sequences,
 * it can achieve O(n log^2 n).
 * </p>
 *
 * @see Sorter
 */
public class ShellSort implements Sorter {

    /**
     * Sorts an array of integers using the Shell Sort algorithm.
     * <p>
     * The algorithm uses a gap sequence to compare and sort elements that are far apart,
     * progressively reducing the gap until it reaches 1, at which point the algorithm becomes
     * similar to insertion sort.
     * </p>
     *
     * @param arr The array of integers to be sorted.
     * @return The sorted array of integers.
     */
    @Override
    public int[] sort(int[] arr) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
        }

        return arr;
    }

    /**
     * Sorts an array of strings using the Shell Sort algorithm.
     * <p>
     * The algorithm uses a gap sequence to compare and sort strings that are far apart lexicographically,
     * progressively reducing the gap until it reaches 1, at which point the algorithm becomes
     * similar to insertion sort.
     * </p>
     *
     * @param arr The array of strings (String) to be sorted.
     * @return The sorted array of strings (String).
     */
    @Override
    public String[] sort(String[] arr) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                String temp = arr[i];
                int j = i;
                
                while (j >= gap && arr[j - gap].compareToIgnoreCase(temp) > 0) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
        }

        return arr;
    }

    /**
     * Returns the name of the sorting algorithm.
     * <p>
     * This method returns the name of the sorting algorithm, in this case, "Shell sort", which is implemented
     * in this class.
     * </p>
     *
     * @return The name of the sorting algorithm.
     */
    @Override
    public String getName() {
        return "Shell sort";
    }
}
