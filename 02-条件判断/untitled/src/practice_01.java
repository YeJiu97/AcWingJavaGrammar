import java.util.Scanner;

public class practice_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x > 10){
            System.out.println(x);
        } else {
            System.out.println(-x);
        }
    }
}
