package patikaorneknot;

import java.util.Scanner;

public class PatikaOrnekNot {

    public static void main(String[] args) {

        
        int mat,fizik,kimya,turkce,tarih,muzik;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Matematik notunuz : ");
        mat = input.nextInt();
        
        System.out.println("Fizik notunuz : ");
        fizik = input.nextInt();
        
        System.out.println("Kimya notunuz : ");
        kimya = input.nextInt();
        
        System.out.println("Turkce notunuz : ");
        turkce = input.nextInt();
        
        System.out.println("Tarih notunuz : ");
        tarih = input.nextInt();
        
        System.out.println("Muzik notunuz : ");
        muzik = input.nextInt();
        
        double ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 5;
        
        System.out.println("Ortalamaniz : " + ortalama + " " + (ortalama >= 60 ? "Gectiniz" : "Kaldiniz"));
        
        
    }
    
}
