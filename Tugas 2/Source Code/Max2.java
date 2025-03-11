import java.util.Scanner;

public class Max2 {
    public static void main(String[] args) {
        int a, b;
        Scanner masukan = new Scanner(System.in);

        System.out.print("Menentukan nilai maksimum dari dua bilangan \n");
        System.out.print("Masukkan dua bilangan, pisahkan dengan ENTER:\n");

        a = masukan.nextInt();
        b = masukan.nextInt();

        System.out.println("Dua bilangan yang dimasukkan: a = " + a + ", b = " + b);

        if (a >= b) {
            System.out.println("Bilangan maksimum adalah: " + a);
        } else {
            System.out.println("Bilangan maksimum adalah: " + b);
        }

    }
}
