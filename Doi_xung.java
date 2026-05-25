package Demo;

import java.util.Scanner;

public class Doi_xung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        int  a = sc.nextInt();
        
        int tam;
        int kq = 0;
        int defaultt = a;
        while(a>0){
            tam =  a % 10;
            kq = kq*10+tam;
            a =a/10;
        }
        if (defaultt==kq){
            System.out.println("hai so doi xung");
        }
        else {
            System.out.println("hai so khong doi xung");
        }
        }
    
}
