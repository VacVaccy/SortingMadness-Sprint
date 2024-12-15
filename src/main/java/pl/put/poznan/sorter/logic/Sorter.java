package pl.put.poznan.sorter.logic;

/**
 * Interface defining the general behavior for sorting algorithms.
 * <p>
 * This interface is used to define the basic methods that must be implemented by 
 * classes implementing sorting algorithms. Classes implementing this interface should 
 * provide methods to sort arrays of integers and arrays of strings, as well as to 
 * return the name of the sorting algorithm.
 * </p>
 */

public interface Sorter {
    /**
     * Sorts an array of integers.
     * <p>
     * Classes implementing this interface should provide an implementation for sorting an array of integers.
     * This method accepts an array of integers and returns the sorted array.
     * </p>
     * 
     * @param arr The array of integers to be sorted.
     * @return The sorted array of integers.
     */
    int[] sort(int[] arr);

    /**
     * Sorts an array of strings (String).
     * <p>
     * Classes implementing this interface should provide an implementation for sorting an array of strings.
     * This method accepts an array of strings and returns the sorted array.
     * </p>
     * 
     * @param arr The array of strings (String) to be sorted.
     * @return The sorted array of strings (String).
     */
    String[] sort(String[] arr);

    /**
     * Returns the name of the sorting algorithm.
     * <p>
     * This method is intended to return the name of the sorting algorithm, which is implemented 
     * by the class implementing this interface.
     * </p>
     * 
     * @return The name of the sorting algorithm.
     */
    String getName();
}