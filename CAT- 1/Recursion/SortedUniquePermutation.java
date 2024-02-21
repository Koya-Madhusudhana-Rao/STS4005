package Recursion;
import java.util.Arrays;

public class SortedUniquePermutation {
    public static void generatePermutations(int[] nums, int index) {
        if (index == nums.length - 1) {
            System.out.println(Arrays.toString(nums));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            generatePermutations(nums, index + 1);
            swap(nums, i, index);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        generatePermutations(array, 0);
    }
}
