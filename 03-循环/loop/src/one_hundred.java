public class one_hundred {
    public static void main(String[] args){

        int i = 1, sum = 0;

        while (i <= 100){
            sum += i * i * i;
            i ++;
        }

        System.out.println(sum);
    }
}
