package Searching;

public class LeadersInArray {
    public static void findLeaders(int[] arr) {
        int n = arr.length;
        int leader = arr[n - 1];
        System.out.print(leader + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > leader) {
                leader = arr[i];
                System.out.print(leader + " ");
            }
        }
    }

    public static void findlearders1(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == size) { // the loop didn't break
                System.out.print(arr[i] + " ");
            }
        }

    }

    public static void main(String[] args) {
        int[] array = { 16, 17, 4, 3, 5, 2 };
        findLeaders(array );
        System.out.println();
        findlearders1(array);
    }
}
