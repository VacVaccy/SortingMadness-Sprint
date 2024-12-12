package pl.put.poznan.sorter.logic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
@Getter
@Setter
public class SortingResponse {
    private String algorithm;
    private int[] sortedData;
    private long sortingTime;
    private String[] sortedData2;

    public SortingResponse(String algorithm, int[] sortedData, long sortingTime) {
        this.algorithm = algorithm;
        this.sortedData = sortedData;
        this.sortingTime = sortingTime;
    }


    public SortingResponse(String algorithm, String[] sortedData2, long sortingTime) {
        this.algorithm = algorithm;
        this.sortedData2 = sortedData2;
        this.sortingTime = sortingTime;
    }
    @Override
    public String toString() {
        return "Algorithm: " + algorithm + ", Sorted Data: " + Arrays.toString(sortedData) + ", Sorting Time: " + sortingTime + "ns";
    }
}
