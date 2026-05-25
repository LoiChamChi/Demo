package Demo;

public class index {
    public static void main(String[] args) {
        System.out.println("hello world");
        int a = 10;
        int b = 10;
        int count = 0;
        int s =0;
        System.out.println(a + b);

        for (int i = 0; i < a; i++) {
             s+=i;
            count++;
        }
        System.out.println("trungbinh:" + (s/count));

    }
}
