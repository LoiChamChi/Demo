package Demo;

import java.util.Scanner;

public class trung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        int  a = sc.nextInt();
        int tam;
        int count = 0;
        while (a>0) {
            tam = a%10;
            a = a/10;
            if(tam==3 ){
                count++;   
            }
        }
        System.out.println("số trùng là : " + count);
    }
}
