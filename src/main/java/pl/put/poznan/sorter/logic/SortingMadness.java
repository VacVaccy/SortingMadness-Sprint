package pl.put.poznan.sorter.logic;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class SortingMadness {

    private final String[] sorts;

    public SortingMadness(String[] sorts){
        this.sorts = sorts;
    }

    public String sort(String text){
        // of course, normally it would do something based on the transforms
        return text.toUpperCase();
    }
}
