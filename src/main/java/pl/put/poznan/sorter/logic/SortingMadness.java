package pl.put.poznan.sorter.logic;

import java.util.ArrayList;
import java.util.List;
/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class SortingMadness {

    private final String[] sorts;

    public SortingMadness(String[] sorts){
        this.sorts = sorts;
    }

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
                    responses.add(new SortingResponse(bubbleSorter.getName(), sortedData, data, sortingTime));
                    break;
                case "2":
                    SelectionSort selectionSorter = new SelectionSort();
                    sortedData = selectionSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(selectionSorter.getName(), sortedData, data, sortingTime));
                    break;
                case "3":
                    InsertionSort insertionSorter = new InsertionSort();
                    sortedData = insertionSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(insertionSorter.getName(), sortedData, data, sortingTime));
                    break;
                case "4":
                    QuickSort quickSorter = new QuickSort();
                    sortedData = quickSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(quickSorter.getName(), sortedData, data, sortingTime));
                    break;
                case "5":
                    HeapSort heapSorter = new HeapSort();
                    sortedData = heapSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(heapSorter.getName(), sortedData, data, sortingTime));
                    break;
                case "6":
                    ShellSort shellSorter = new ShellSort();
                    sortedData = shellSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(shellSorter.getName(), sortedData, data, sortingTime));
                    break;
                default :
                    throw new IllegalArgumentException("Unknown sorting algorithm: " + sortn);
            }
        }
        return responses;
    }

    public String[] getSorts() {
        return this.sorts;
    }


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
                    responses.add(new SortingResponse(bubbleSorter.getName(), sortedData, data, sortingTime));
                    break;
                case "2":
                    SelectionSort selectionSorter = new SelectionSort();
                    sortedData = selectionSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(selectionSorter.getName(), sortedData, data, sortingTime));
                    break;
                case "3":
                    InsertionSort insertionSorter = new InsertionSort();
                    sortedData = insertionSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(insertionSorter.getName(), sortedData, data, sortingTime));
                    break;
                case "4":
                    QuickSort quickSorter = new QuickSort();
                    sortedData = quickSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(quickSorter.getName(), sortedData, data, sortingTime));
                    break;
                case "5":
                    HeapSort heapSorter = new HeapSort();
                    sortedData = heapSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(heapSorter.getName(), sortedData, data, sortingTime));
                    break;
                case "6":
                    ShellSort shellSorter = new ShellSort();
                    sortedData = shellSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse(shellSorter.getName(), sortedData, data, sortingTime));
                    break;
                default :
                    throw new IllegalArgumentException("Unknown sorting algorithm: " + sortn);
            }
        }
        return responses;
    }
}
