package Searching;
public class MajorityElement {
    public static int findMajorityElement(int[] arr) {
        int candidate = 0, count = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] array = {2, 2, 3, 3, 2, 2, 5, 2, 2};
        int result = findMajorityElement(array);
        System.out.println("Majority Element: " + result);
        
    }
}
