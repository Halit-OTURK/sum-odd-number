package donguler;

import java.util.Scanner;

public class TekSayiToplama {
    public static void main(String[] args) {
        int n,toplam=0;
        Scanner inp= new Scanner(System.in);

        do { System.out.print("Lutfen Sayi Giriniz:");
            n= inp.nextInt();
            if(n%2 == 1){ toplam += n;}
            System.out.println("Toplam:"+toplam);
        } while (n>0);





    }
}
