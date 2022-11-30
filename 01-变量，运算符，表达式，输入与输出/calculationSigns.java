public class calculationSigns {

    public static void main(String[] args){

        int a = 10, b = 20;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);

        System.out.println(a / b);

        System.out.println(a % b);  //取模运算符，向零整除后的余数，注意余数可能为负数
        System.out.println(++a);  // a++：先取值后加1；++a：先加1后取值
        System.out.println(--a);  // a--：先取值后减1；--a：先减1后取值

        System.out.println(a+=b); // a = a + b 可以简写为 a += b
        System.out.println(a-=b); // a = a - b 可以简写为 a -= b
        System.out.println(a*=b); // a = a * b 可以简写为 a *= b
        System.out.println(a/=b); // a = a / b 可以简写为 a /= b
        System.out.println(a%=b); // a = a % b 可以简写为 a %= b
    }
}
