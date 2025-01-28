package pl.put.poznan.sorter.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * Class responsible for managing and executing multiple sorting algorithms.
 * <p>
 * The {@code SortingMadness} class allows for the sorting of integer and string arrays using various
 * algorithms. The algorithms to be applied are provided via the constructor, and the class
 * executes the sorting for each specified algorithm, measuring the execution time and generating responses.
 * </p>
 *
 * @see BubbleSort
 * @see SelectionSort
 * @see InsertionSort
 * @see QuickSort
 * @see HeapSort
 * @see ShellSort
 */
public class SortingMadness {
    private final String[] sorts;

    /**
     * Constructs a new {@code SortingMadness} instance with the specified sorting algorithms.
     *
     * @param sorts An array of strings representing the sorting algorithms to be used.
     *              Each algorithm is mapped to a specific number:
     *              <ul>
     *                  <li>"1" - Bubble Sort</li>
     *                  <li>"2" - Selection Sort</li>
     *                  <li>"3" - Insertion Sort</li>
     *                  <li>"4" - Quick Sort</li>
     *                  <li>"5" - Heap Sort</li>
     *                  <li>"6" - Shell Sort</li>
     *              </ul>
     */
    public SortingMadness(String[] sorts){
        this.sorts = sorts;
    }

    /**
     * Sorts an array of integers using the specified sorting algorithms.
     * <p>
     * This method iterates through the list of specified algorithms, applies each one to a copy of the
     * input array, and records the sorting time along with the sorted data.
     * </p>
     *
     * @param data The array of integers to be sorted.
     * @return A list of {@code SortingResponse} objects containing the results of the sorting.
     */
    public List<SortingResponse> sortInts(int[] data) {
        List<SortingResponse> responses = new ArrayList<>();
        int[] sortedData;

        for (String sortn : sorts) {
            long sortingTime = System.nanoTime();
            switch (sortn) {
                case "1":
                    BubbleSort bubbleSorter = new BubbleSort();
                    sortedData = bubbleSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(bubbleSorter.getName(), data, sortedData, sortingTime));
                    break;
                case "2":
                    SelectionSort selectionSorter = new SelectionSort();
                    sortedData = selectionSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(selectionSorter.getName(), data, sortedData, sortingTime));
                    break;
                case "3":
                    InsertionSort insertionSorter = new InsertionSort();
                    sortedData = insertionSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(insertionSorter.getName(), data, sortedData, sortingTime));
                    break;
                case "4":
                    QuickSort quickSorter = new QuickSort();
                    sortedData = quickSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(quickSorter.getName(), data, sortedData, sortingTime));
                    break;
                case "5":
                    HeapSort heapSorter = new HeapSort();
                    sortedData = heapSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(heapSorter.getName(), data, sortedData, sortingTime));
                    break;
                case "6":
                    ShellSort shellSorter = new ShellSort();
                    sortedData = shellSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(shellSorter.getName(), data, sortedData, sortingTime));
                    break;
                default :
                    throw new IllegalArgumentException("Unknown sorting algorithm: " + sortn);
            }
        }
        return responses;
    }

    /**
     * Retrieves the list of sorting algorithms configured for this instance.
     *
     * @return An array of strings representing the sorting algorithms.
     */
    public String[] getSorts() {
        return this.sorts;
    }

    /**
     * Sorts an array of strings using the specified sorting algorithms.
     * <p>
     * Similar to {@link #sortInts(int[])}, this method applies each specified algorithm to a copy of the
     * input string array, measuring the sorting time and recording the sorted data.
     * </p>
     *
     * @param data The array of strings to be sorted.
     * @return A list of {@code SortingResponse} objects containing the results of the sorting.
     */
    public List<SortingResponse> sortStrings(String[] data) {
        List<SortingResponse> responses = new ArrayList<>();
        String[] sortedData;

        for (String sortn : sorts) {
            long sortingTime = System.nanoTime();
            switch (sortn) {
                
                case "1":
                    BubbleSort bubbleSorter = new BubbleSort();
                    sortedData = bubbleSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(bubbleSorter.getName(), data, sortedData, sortingTime));
                    break;
                case "2":
                    SelectionSort selectionSorter = new SelectionSort();
                    sortedData = selectionSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(selectionSorter.getName(), data, sortedData, sortingTime));
                    break;
                case "3":
                    InsertionSort insertionSorter = new InsertionSort();
                    sortedData = insertionSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(insertionSorter.getName(), data, sortedData, sortingTime));
                    break;
                case "4":
                    QuickSort quickSorter = new QuickSort();
                    sortedData = quickSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(quickSorter.getName(), data, sortedData, sortingTime));
                    break;
                case "5":
                    HeapSort heapSorter = new HeapSort();
                    sortedData = heapSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(heapSorter.getName(), data, sortedData, sortingTime));
                    break;
                case "6":
                    ShellSort shellSorter = new ShellSort();
                    sortedData = shellSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(shellSorter.getName(), data, sortedData, sortingTime));
                    break;
                default :
                    throw new IllegalArgumentException("Unknown sorting algorithm: " + sortn);
            }
        }
        return responses;
    }
}
