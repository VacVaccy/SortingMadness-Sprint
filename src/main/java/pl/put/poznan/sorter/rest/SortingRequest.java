package pl.put.poznan.sorter.rest;

import lombok.Getter;

public class SortingRequest {

    @Getter
    private int[] data;
    @Getter
    private String[] sorts;

    public void setData(int[] data) {
        this.data = data;
    }

    public void setSorts(String[] sorts) {
        this.sorts = sorts;
    }



}
