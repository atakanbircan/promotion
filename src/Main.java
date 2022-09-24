import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        Scanner inp = new Scanner(System.in);
        System.out.println("matematik notunuz:");
        mat =inp.nextInt();
        System.out.println("Türkçe notunuzu giriniz");
        turkce=inp.nextInt();
        System.out.println("fizik notunuz:");
        fizik=inp.nextInt();
        System.out.println("kimya notunuz:");
        kimya=inp.nextInt();
        System.out.println("müzik notunuz:");
        muzik=inp.nextInt();

        double avarage=(mat+fizik+turkce+kimya+muzik)/5;
        System.out.println("ortalamanız"+avarage);
        if (avarage<=55){
            System.out.println("sınıfta kaldınız!");
        }
        else{
            System.out.println("tebrikler!sınıf gectiniz!");
        }

    }
}