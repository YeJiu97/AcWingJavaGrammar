import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);  // 这里相当于是创建了一个Scanner类型的对象sc，并且new了一个进行赋值

//        String str = sc.nextLine();  // 这将会读取一整行
//        System.out.println(str);

        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a + b);
    }
}