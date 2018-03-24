package execute;

import java.util.stream.IntStream;

public class Recursive {
    public static void main(String[] args) {
        int num = 100;
        execute(num);
        executeReverse(num);
        System.out.println(factorial(5));

        int[] numArr = IntStream.range(0, 100).toArray();
        System.out.println(sum(numArr, numArr.length - 1));
    }

    static void execute(int num) {
        if (num < 0) {
            System.out.println("끝");
            return;
        }

        System.out.println(num);
        execute(num - 1);
    }

    static void executeReverse(int num) {
        if (num < 0) {
            System.out.println("시작");
            return;
        }

        executeReverse(num - 1);
        System.out.println(num);
    }

    static int factorial(int num) {
        if (num == 1) {
            return num;
        }

        return num * factorial(num - 1);
    }

    static int sum(int[] arr, int idx) {
        if (idx < 0) {
            return 0;
        }

        return arr[idx] + sum(arr, idx - 1);
    }
}
