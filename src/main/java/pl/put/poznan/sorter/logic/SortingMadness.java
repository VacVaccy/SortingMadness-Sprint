package pl.put.poznan.sorter.logic;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class SortingMadness {

    private final String[] sorts;
    
    public SortingMadness(String[] sorts){
        this.sorts = sorts;
    }

    public int[] sort(int[] data) {
        for (String sortn : sorts) {
            switch (sortn) {
                case "1":
                    data = SortingAlgorithm.bubbleSort(data);
                    break;
                default :
                    throw new IllegalArgumentException("Unknown sorting algorithm: " + sortn);
            }
        }
        return data;
    }

    public String[] getSorts() {
        return this.sorts;
    }


}
