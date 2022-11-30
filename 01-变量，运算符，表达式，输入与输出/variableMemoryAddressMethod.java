public class variableMemoryAddressMethod {
    public static void main(String[] args){

        int a = 10;
        int b = a;

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));

        a = 20;

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));

    }
}
