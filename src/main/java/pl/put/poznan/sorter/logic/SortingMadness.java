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

        for (String sortn : sorts) {
            long sortingTime = System.nanoTime();
            switch (sortn) {
                
                case "1":
                    BubbleSort bubbleSorter = new BubbleSort();
                    data = bubbleSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse("Bubble sort", data, sortingTime));
                    break;
                case "2":
                    SelectionSort selectionSorter = new SelectionSort();
                    data = selectionSorter.sort(data);
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse("Selection sort", data, sortingTime));
                    break;
                case "3":
                    InsertionSort insertionSorter = new InsertionSort();
                    data = insertionSorter.sort(data);
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse("Insertion sort", data, sortingTime));
                    break;
                case "4":
                    QuickSort quickSorter = new QuickSort();
                    data = quickSorter.sort(data);
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse("Quick sort", data, sortingTime));
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

        for (String sortn : sorts) {
            long sortingTime = System.nanoTime();
            switch (sortn) {
                
                case "1":
                    BubbleSort bubbleSorter = new BubbleSort();
                    data = bubbleSorter.sort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse("Bubble sort", data, sortingTime));
                    break;
                case "2":
                    SelectionSort selectionSorter = new SelectionSort();
                    data = selectionSorter.sort(data);
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse("Selection sort", data, sortingTime));
                    break;
                case "3":
                    InsertionSort insertionSorter = new InsertionSort();
                    data = insertionSorter.sort(data);
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse("Insertion sort", data, sortingTime));
                    break;
                case "4":
                    QuickSort quickSorter = new QuickSort();
                    data = quickSorter.sort(data);
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse("Quick sort", data, sortingTime));
                    break;
                default :
                    throw new IllegalArgumentException("Unknown sorting algorithm: " + sortn);
            }
        }
        return responses;
    }
}
