import java.util.Scanner;

public class if_condition {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 5){
            System.out.printf("%d is big!\n", a);
            System.out.printf("%d + 1 = %d\n", a, a + 1);
        } else {
            System.out.printf("%d is small!\n", a);
            System.out.printf("%d - 1 = %d\n", a, a - 1);
        }
    }
}
