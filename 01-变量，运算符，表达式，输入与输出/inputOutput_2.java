import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inputOutput_2 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        System.out.println(x + y);
    }
}