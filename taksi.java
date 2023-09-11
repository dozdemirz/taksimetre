import java.util.Scanner;

public class taksi {
    public static void main(String[] args) {
        double km, kmfiyat = 2.20, tutar, acilisFiyat = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Gidilecek kilometreyi giriniz :");
        km = input.nextDouble();

        tutar = acilisFiyat + (km * kmfiyat);
        if (tutar < 20)
            tutar = 20;

        else
            tutar = acilisFiyat + (km * kmfiyat);

        System.out.println("Tutarınız :" + tutar);

    }
}