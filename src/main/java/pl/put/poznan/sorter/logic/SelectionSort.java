package pl.put.poznan.sorter.logic;

public class SelectionSort implements Sorter {
    @Override
    public int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_id = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_id]) {
                    min_id = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_id];
            arr[min_id] = temp;
        }
        return arr;
    }

    @Override
    public String[] sort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_id = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[min_id]) < 0) {
                    min_id = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[min_id];
            arr[min_id] = temp;
        }
        return arr;
    }

    @Override
    public String getName() {
        return "Selection sort";
    }
}
