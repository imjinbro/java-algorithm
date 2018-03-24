package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] numArr = {1, 6, 4, 3, 7, 2};
        sort(numArr, 0, numArr.length - 1);
        for (int num : numArr) {
            System.out.print(num + " ");
        }
    }


    private static void sort(int[] numArr, int startIdx, int endIdx) {
        if (isFinishLoop(startIdx, endIdx)) {
            return;
        }

        int pivotIdx = startIdx;
        int leftIdx = startIdx + 1;
        int rightIdx = endIdx;

        while (!isFinishLoop(leftIdx, rightIdx)) {
            leftIdx = searchBiggerThanPivot(numArr, pivotIdx, leftIdx);
            rightIdx = searchSmallerThanPivot(numArr, pivotIdx, rightIdx);
            swap(numArr, leftIdx, rightIdx);
        }

        pivotIdx = pivotSwap(numArr, pivotIdx, rightIdx);
        sort(numArr, startIdx, pivotIdx - 1);
        sort(numArr, pivotIdx + 1, endIdx);
    }

    private static void swap(int[] numArr, int leftIdx, int rightIdx) {
        if (isFinishLoop(leftIdx, rightIdx)) {
            return;
        }
        int temp = numArr[leftIdx];
        numArr[leftIdx] = numArr[rightIdx];
        numArr[rightIdx] = temp;
    }

    private static int pivotSwap(int[] numArr, int pivotIdx, int targetIdx) {
        swap(numArr, pivotIdx, targetIdx);
        return targetIdx;
    }

    private static boolean isFinishLoop(int startIdx, int endIdx) {
        return startIdx > endIdx;
    }

    private static int searchBiggerThanPivot(int[] numArr, int pivotIdx, int startIdx) {
        int idx = startIdx;
        for (int i = startIdx; i < numArr.length; i++) {
            idx = i;
            if (numArr[pivotIdx] <= numArr[i]) {
                break;
            }
        }
        return idx;
    }

    private static int searchSmallerThanPivot(int[] numArr, int pivotIdx, int startIdx) {
        int idx = startIdx;
        for (int i = startIdx; i >= 0; i--) {
            idx = i;
            if (numArr[pivotIdx] >= numArr[i]) {
                break;
            }
        }
        return idx;
    }
}
