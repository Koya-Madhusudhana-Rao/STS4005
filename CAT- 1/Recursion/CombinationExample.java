package Recursion;

public class CombinationExample {
    public static int calculateCombination(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        }
      
        return calculateCombination(n - 1, r - 1) + calculateCombination(n - 1, r);
    }
    

    public static void main(String[] args) {
        int n = 5, r = 2;
        int result = calculateCombination(n, r);
        System.out.println("Combination of C(" + n + ", " + r + "): " + result);
    }
}
