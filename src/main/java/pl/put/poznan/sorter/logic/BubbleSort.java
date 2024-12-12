package pl.put.poznan.sorter.logic;

/**
 * Klasa implementująca algorytm sortowania bąbelkowego.
 * <p>
 * Algorytm sortowania bąbelkowego polega na wielokrotnym przechodzeniu przez tablicę,
 * porównywaniu sąsiednich elementów i zamianie ich miejscami, jeśli są w złej kolejności.
 * Zamiiana elementów odbywa się "bąbelkowo", tzn. największy element przechodzi na koniec tablicy
 * po każdym pełnym przebiegu.
 * </p>
 * <p>
 * Czasowa złożoność algorytmu: O(n^2) w najgorszym przypadku, O(n) w najlepszym przypadku,
 * gdy tablica jest już posortowana.
 * </p>
 * 
 * @see Sorter
 */

public class BubbleSort implements Sorter {

    /**
     * Sortuje tablicę liczb całkowitych przy użyciu algorytmu sortowania bąbelkowego.
     * <p>
     * Działa na zasadzie porównywania sąsiednich elementów i ich zamiany, jeśli są w złej kolejności.
     * Powtarza tę operację do momentu, gdy tablica będzie posortowana.
     * </p>
     * 
     * @param arr Tablica liczb całkowitych do posortowania.
     * @return Posortowana tablica liczb całkowitych.
     */
    @Override
    public int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * Sortuje tablicę łańcuchów znaków przy użyciu algorytmu sortowania bąbelkowego.
     * <p>
     * Działa na zasadzie porównywania sąsiednich elementów i ich zamiany, jeśli są w złej kolejności.
     * Powtarza tę operację do momentu, gdy tablica będzie posortowana.
     * </p>
     * 
     * @param arr Tablica łańcuchów znaków (String) do posortowania.
     * @return Posortowana tablica łańcuchów znaków (String).
     */
    @Override
    public String[] sort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    @Override
    public String getName() {
        return "Bubble sort";
    }
}
