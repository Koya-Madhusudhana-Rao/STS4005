public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {3,6,4,1,8,9,10};
        dividing(arr);

    }

    public static void dividing(int[] arr){
        int n = arr.length;
        int mid = n/2;
        int left = arr[0];
        int right = arr[n-1];
        System.out.println(mid+" "+left+" "+right);
    }
    
}
