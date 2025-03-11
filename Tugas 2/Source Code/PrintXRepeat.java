import java.util.Scanner;

public class PrintXRepeat {
    public static void main(String[] args) {
        int sum, x;
        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");
        x = masukan.nextInt();

        if (x == 999) {
            System.out.print("Kasus kosong \n");
        } else {
            sum = 0;
            do {
                sum += x;
                System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");
                x = masukan.nextInt();
            } while (x != 999);

            System.out.println("Hasil penjumlahan = " + sum);
        }
    }
}
