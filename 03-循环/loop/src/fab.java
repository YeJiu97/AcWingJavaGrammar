import java.util.Scanner;

public class fab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 1, b = 1, i = 1;
        while (i < n) {
            int c = a + b;
            a = b;
            b = c;
            i ++ ;
        }

        System.out.println(a);
    }
}
