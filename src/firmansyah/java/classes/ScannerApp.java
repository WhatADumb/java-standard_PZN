package firmansyah.java.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukan Umur: ");
        int age = scan.nextInt();

        scan.close();

        System.out.println("Hello " + nama + ", umur anda " + age);
    }
}
