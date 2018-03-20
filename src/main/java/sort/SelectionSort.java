package sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 1, 2, 6, 4, 0, 3, 5, 8};
        selectionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallIdx = findSmallestVal(arr, i);
            int temp = arr[i];
            arr[i] = arr[smallIdx];
            arr[smallIdx] = temp;
        }
    }

    private static int findSmallestVal(int[] arr, int startIdx) {
        int smallIdx = startIdx;
        for (int i = startIdx; i < arr.length; i++) {
            if (arr[smallIdx] > arr[i]) {
                smallIdx = i;
            }
        }
        return smallIdx;
    }

}
