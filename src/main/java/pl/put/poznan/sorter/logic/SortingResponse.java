package pl.put.poznan.sorter.logic;

import java.util.Arrays;

public class SortingResponse {
    private String algorithm;
    private int[] sortedData;
    private long sortingTime;

    public SortingResponse(String algorithm, int[] sortedData, long sortingTime) {
        this.algorithm = algorithm;
        this.sortedData = sortedData;
        this.sortingTime = sortingTime;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public int[] getSortedData() {
        return sortedData;
    }

    public long getSortingTime() {
        return sortingTime;
    }
    @Override
    public String toString() {
        return "Algorithm: " + algorithm + ", Sorted Data: " + Arrays.toString(sortedData) + ", Sorting Time: " + sortingTime + "ns";
    }
}
