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

    public List<SortingResponse> sort(int[] data) {
        List<SortingResponse> responses = new ArrayList<>();

        for (String sortn : sorts) {
            long sortingTime = System.nanoTime();
            switch (sortn) {
                
                case "1":
                    data = SortingAlgorithm.bubbleSort(data.clone());
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse("Bubble sort", data, sortingTime));
                    break;
                case "2":
                    data = SortingAlgorithm.selectionSort(data);
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse("Selection sort", data, sortingTime));
                    break;
                case "3":
                    data = SortingAlgorithm.insertionSort(data);
                    sortingTime = System.nanoTime() - sortingTime;
                    responses.add(new SortingResponse("Insertion sort", data, sortingTime));
                    break;
                case "4":
                    data = SortingAlgorithm.quickSort(data);
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


}
