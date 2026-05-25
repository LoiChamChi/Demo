package Demo;

import java.util.Scanner;

public class giaythua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = sc.nextInt();
        int sum = 1;

        for (int i = 1; i <= a; i++) {
            sum *= i;
        }
        System.out.println(a + "! là :" + sum);
    }
}
