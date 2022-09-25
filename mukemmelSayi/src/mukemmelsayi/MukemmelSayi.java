package mukemmelsayi;

import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String[] args) {
        
        Scanner deger = new Scanner(System.in);
        int sayi = deger.nextInt();
        
        int toplam = 0;
        int i;
        
        for(i = 1 ; i <= sayi ; i++)
        {
            if(sayi % i == 0)
            {
                toplam += i;
            }
        }
        
        if((toplam / 2) == sayi)
        {
            System.out.println("Girilen sayi mukemmel sayidir.");
        }
        
        else
        {
            System.out.println("Girilen sayi mukemmel sayi degildir.");
        }
    }
    
}
