import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class outputMethod {
    public static void main(String[] args) throws Exception {
        // 方式1，效率较低，输出规模较小时使用。
        System.out.println(123);  // 输出整数 + 换行
        System.out.println("Hello World");  // 输出字符串 + 换行
        System.out.print(123);  // 输出整数
        System.out.print("yxc\n");  // 输出字符串
        System.out.printf("%04d %.2f\n", 4, 123.456D);  // 格式化输出，float与double都用%f输出

        // 方式2，

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  // BufferedReader改为BufferedWriter
        bw.write("Hello World\n");
        bw.flush();  // 需要手动刷新缓冲区
    }
}
