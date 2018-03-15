import java.util.stream.IntStream;

public class BinarySearch {
    // 조건 : sorted
    public static void main(String[] args) {
        int[] nums = IntStream.rangeClosed(1, 100).toArray();
        System.out.println(searchNum(nums, 1));
        System.out.println(searchNum(nums, 100));
        System.out.println(searchNum(nums, 101));
    }

    static int searchNum(int[] nums, int target) {
        return binarySearchNum(nums, target, 0, nums.length - 1);
    }

    static int binarySearchNum(int[] nums, int target, int startIdx, int endIdx) {
        if (startIdx > endIdx) {
            return -1;
        }

        int halfIdx = (startIdx + endIdx) / 2;
        if (nums[halfIdx] > target) {
            return binarySearchNum(nums, target, startIdx, halfIdx - 1);
        }

        if (nums[halfIdx] < target) {
            return binarySearchNum(nums, target, halfIdx + 1, endIdx);
        }
        return nums[halfIdx];
    }
}
