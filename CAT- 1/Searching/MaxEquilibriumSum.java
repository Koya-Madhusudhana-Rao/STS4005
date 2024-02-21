package Searching;
import java.util.Scanner;
public class MaxEquilibriumSum {
    Scanner sc = new Scanner(System.in);
    public static int equilibriumIndex(int[] arr) {
        int totalSum = 0, leftSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1; // No equilibrium index found
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,4,3,2,1};
        int result = equilibriumIndex(array);
        System.out.println("Equilibrium Index: " + result);
    }
}
