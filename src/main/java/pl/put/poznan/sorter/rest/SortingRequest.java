package pl.put.poznan.sorter.rest;

public class SortingRequest {

    private int[] data;
    private String[] sorts;

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public String[] getSorts() {
        return sorts;
    }

    public void setSorts(String[] sorts) {
        this.sorts = sorts;
    }
}
