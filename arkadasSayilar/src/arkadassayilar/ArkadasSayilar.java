package arkadassayilar;

import java.util.Scanner;

public class ArkadasSayilar {

    public static void main(String[] args) {

        Scanner deger = new Scanner(System.in);
        int sayi = deger.nextInt();
        
        Scanner deger2 = new Scanner(System.in);
        int sayi2 = deger2.nextInt();
        
        int toplam = 0;
        int toplam2 = 0;
        int i;
        
        for(i = 1 ; i < sayi ; i++)
        {
            if(sayi % i == 0)
            {
                toplam += i;
            }
        }
        
        for(i = 1 ; i < sayi2 ; i++)
        {
            if(sayi2 % i == 0)
            {
                toplam2 += i;
            }
        }
        
        if(toplam == sayi2 && toplam2 == sayi)
        {
            System.out.println("Girilen sayilar arkadas sayilardir.");
        }
        
        else
        {
            System.out.println("Girilen sayilar arkadas sayilar degildir.");
        }
    }
    
}
