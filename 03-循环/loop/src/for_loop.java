public class for_loop {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i ++ ) {  // 循环体中只有一条语句时，可以不加大括号
//            System.out.println(i);

        int sum = 0;
        for (int i = 1; i <= 100; i ++ )
            sum += i * i * i;
        System.out.println(sum);
        }
}
