import java.util.Arrays;

public class rcombinations {
    public static int cnt = 0;

    public static void combination(int[] arr, int[] comb, int level, int ind) {
        if (level == comb.length) {
            System.out.println(Arrays.toString(comb));
            ;
            cnt++;
            return;
        }
        if (ind == arr.length)
            return;
        comb[level] = arr[ind];
        combination(arr, comb, level + 1, ind + 1);
        combination(arr, comb, level, ind + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int r = 3;
        int[] comb = new int[r];
        // combination(arr, comb, 0, 0);
        // System.out.println(cnt);
        example();

    }

    public static void example() {
        int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;
        int max_from_right = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (max_from_right < arr[i]) {
                max_from_right = arr[i];
                System.out.print(max_from_right + " ");
            }
        }

    }
}