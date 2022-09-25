package asalsayi;

import java.util.Scanner;

public class AsalSayi {

    public static void main(String[] args) {
    
        Scanner sayi  = new Scanner(System.in);
        int sonuc = sayi.nextInt();
        //System.out.println(sonuc);
        
        boolean kontrol = true;
        
        for(int i = 2 ; i < sonuc/2 ; i++)
        {
            kontrol = true;
            if(sonuc % i == 0)
            {
                kontrol = false;
                break;
            }
            
        }
        
        if(kontrol == true)
        {
            System.out.println("Girilen " + sonuc + " sayisi asaldir");
        }
        
        else
        {
            System.out.println("Girilen " + sonuc + " sayisi asal degildir");
        }
    
    }
    
}
