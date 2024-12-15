package pl.put.poznan.sorter.rest;

import lombok.Data;

import java.util.Arrays;

@Data
public class SortingPostRequest {

    private Object[] data;
    private String[] sorts;

    public String[] getDataAsStrings() {
        return Arrays.stream(data)
                .map(Object::toString)
                .toArray(String[]::new);
    }
}
