package pl.put.poznan.sorter.logic;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

/**
 * Class representing the response of a sorting operation.
 * <p>
 * The {@code SortingResponse} class contains detailed information about the sorting operation,
 * including the algorithm used, the original and sorted data (for both numerical and textual inputs),
 * and the time taken to complete the sorting.
 * </p>
 */
@Getter
@Setter
public class SortingResponse {
    private String algorithm;
    private int[] originalDataNumbers;
    private int[] sortedDataNumbers;
    private long sortingTime;
    private String[] originalDataText;
    private String[] sortedDataText;

    /**
     * Constructs a {@code SortingResponse} for sorting operations involving numerical data.
     *
     * @param algorithm The name of the sorting algorithm used.
     * @param originalDataNumbers The original array of integers before sorting.
     * @param sortedDataNumbers The sorted array of integers.
     * @param sortingTime The time taken to complete the sorting operation, in nanoseconds.
     */
    public SortingResponse(String algorithm,int[] originalDataNumbers, int[] sortedDataNumbers, long sortingTime) {
        this.algorithm = algorithm;
        this.originalDataNumbers = originalDataNumbers;
        this.sortedDataNumbers = sortedDataNumbers;
        this.sortingTime = sortingTime;
    }

    /**
     * Constructs a {@code SortingResponse} for sorting operations involving textual data.
     *
     * @param algorithm The name of the sorting algorithm used.
     * @param originalDataText The original array of strings before sorting.
     * @param sortedDataText The sorted array of strings.
     * @param sortingTime The time taken to complete the sorting operation, in nanoseconds.
     */
    public SortingResponse(String algorithm, String[] originalDataText, String[] sortedDataText,  long sortingTime) {
        this.algorithm = algorithm;
        this.originalDataText = originalDataText;
        this.sortedDataText = sortedDataText;
        this.sortingTime = sortingTime;
    }

    /**
     * Returns a string representation of the sorting response.
     * <p>
     * The representation includes the algorithm name, original and sorted data (if available),
     * and the sorting time.
     * </p>
     *
     * @return A string representation of the sorting response.
     */
    @Override
    public String toString() {
        return "Algorithm: " + algorithm
        + ", Original Data Numbers: " + Arrays.toString(originalDataNumbers)
        + ", Sorted Data Numbers: " + Arrays.toString(sortedDataNumbers) 
        + ", Sorting Time: " + sortingTime + "ns" 
        + ", Original Data Text: " + Arrays.toString(originalDataText)
        + ", Sorted Data Text: " + Arrays.toString(sortedDataText);
    }
}
