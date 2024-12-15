package pl.put.poznan.sorter.rest;

import lombok.Getter;

import java.util.Arrays;

public class SortingRequest {

    @Getter
    private int[] data;
    @Getter
    private String[] sorts;
    private String[] dataStrings;

    public void setData(int[] data) {
        this.data = data;
    }

    public void setSorts(String[] sorts) {
        this.sorts = sorts;
    }



}
