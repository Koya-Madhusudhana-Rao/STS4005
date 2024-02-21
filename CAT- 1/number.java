// import java.util.Map;
// import java.util.TreeMap;

// public class number {
//     public static int fact(int n){
//         int fact=1;
//         for(int i=1;i<=n;i++) fact=fact*i;
//         return fact;
//     }
//     public static void main(String[] args) {
//         String s="AABBCD";
//         char[] arr=s.toCharArray();
//         Map<Character,Integer> cntmap=new TreeMap<>();
//         for(char ch:arr){
//             cntmap.put(ch,cntmap.getOrDefault(ch,0)+1);
//             System.out.println(cntmap);
//         }
//         int f=fact(arr.length);
//         for(Map.Entry<Character, Integer> entry: cntmap.entrySet()){
//             f=f/fact(entry.getValue());
//         }
//         System.out.println(f);
//     }
// }
public class number {
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        String s = "AACD";
        char[] arr = s.toCharArray();

        int[] charCounts = new int[256]; // Assuming ASCII characters

        for (char ch=0; ch<arr.length; ch++) {
            charCounts[ch]++;
        }
        // for(int ch:charCounts){
        //     System.out.println(ch);
        // }

        int totalPermutations = fact(arr.length);

        for (int count : charCounts) {
            if (count > 1) {
                totalPermutations /= fact(count);
            }
        }

        System.out.println(totalPermutations);
    }
}
