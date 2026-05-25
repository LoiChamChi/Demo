package Demo;

import java.util.Scanner;

public class sumso {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        int  a = sc.nextInt();
        int tam;
        int kq =0;
        int count = 0;
        while(a>0){
            tam = a%10;
            kq += tam;
            a = a/10;
            count++;
        }
        System.out.println("sum là : " + kq);
        System.out.println("trung binh cong: " + (kq/count));
    }
}
