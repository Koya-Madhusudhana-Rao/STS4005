import java.util.Scanner;

public class towerofhanoi {
    public static void toh(int n, char A, char C, char B    ){
        if (n==0|| n==1) {
            System.out.println("Move disk 1 from rod " + A + " to rod " + C);

            return;
        }
        toh(n-1, A, B, C);
        System.out.println("Move disk " + n + " from rod "+ A + " to rod " + C); 
        toh(n-1, B, C, A);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toh(n, 'A', 'B', 'C');

    }
}