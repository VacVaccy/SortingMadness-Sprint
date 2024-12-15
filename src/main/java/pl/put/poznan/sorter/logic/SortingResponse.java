package pl.put.poznan.sorter.logic;

// import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
// import org.springframework.stereotype.Component;
// import org.springframework.stereotype.Service;

import java.util.Arrays;
@Getter
@Setter
public class SortingResponse {
    private String algorithm;
    private int[] originalDataNumbers;
    private int[] sortedDataNumbers;
    private long sortingTime;
    private String[] originalDataText;
    private String[] sortedDataText;


    public SortingResponse(String algorithm,int[] originalDataNumbers, int[] sortedDataNumbers, long sortingTime) {
        this.algorithm = algorithm;
        this.originalDataNumbers = originalDataNumbers;
        this.sortedDataNumbers = sortedDataNumbers;
        this.sortingTime = sortingTime;
    }


    public SortingResponse(String algorithm, String[] originalDataText, String[] sortedDataText,  long sortingTime) {
        this.algorithm = algorithm;
        this.originalDataText = originalDataText;
        this.sortedDataText = sortedDataText;
        this.sortingTime = sortingTime;
    }
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
