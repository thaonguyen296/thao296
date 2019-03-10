package session1;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        int n, i , n1=0, n2=1, n3;
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap vao so phan tu trong day fibonacci");
        n = nhap.nextInt();
        System.out.println(n1+n2);
        for (i=2; i<=n; ++i){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
