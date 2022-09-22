import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        int number = scan.nextInt();
        int toplam = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam += i;
            }
        }

        if (toplam == number) {
            System.out.println(number + " Mükkemmel Sayıdır");
        } else {
            System.out.println(number + " Mükkemmel Sayı Değildir.");
        }

    }
}
