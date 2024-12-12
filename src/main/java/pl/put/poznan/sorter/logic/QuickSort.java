package pl.put.poznan.sorter.logic;

import java.util.Stack;

public class QuickSort implements Sorter {
    @Override
    public int[] sort(int[] arr) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0, arr.length - 1});

        while (!stack.isEmpty()) {
            int[] range = stack.pop();
            int left = range[0];
            int right = range[1];

            if (left >= right) {
                continue;
            }

            int pivot = partition(arr, left, right);

            stack.push(new int[]{left, pivot - 1});
            stack.push(new int[]{pivot + 1, right});
        }
        return arr;
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            while (i <=j && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;

        return j;
    }

    @Override
    public String[] sort(String[] arr) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0, arr.length - 1});
        while (!stack.isEmpty()) {
            int[] range = stack.pop();
            int left = range[0];
            int right = range[1];

            if (left >= right) {
                continue;
            }
            int pivot = partition(arr, left, right);
            stack.push(new int[]{left, pivot - 1});
            stack.push(new int[]{pivot + 1, right});
        }
        return arr;
    }

    private static int partition(String[] arr, int left, int right) {
        String pivot = arr[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {
            while (i <= j && arr[i].compareTo(pivot) <= 0) i++;
            while (i <= j && arr[j].compareTo(pivot) > 0) j--;

            if (i < j) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        String temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;

        return j;
    }

    @Override
    public String getName() {
        return "Quick sort";
    }
}
