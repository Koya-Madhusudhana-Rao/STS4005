package Searching;
import java.util.Arrays;

public class BinarySearchExample {
    public static int binarySearch(int[] arr, int key) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;
        int result = binarySearch(array, key);
        System.out.println("Index of " + key + ": " + result);
    }
}
