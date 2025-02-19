package Minggu3;
public class Tugas2 {
    public static void main(String[] args) {
        int angka = 2;
        System.out.println("Do-While");
        System.out.println("Bilangan kelipatan 2 (0-100)");
        System.out.println("============================");
        do {
            System.out.println(angka +" ");
            angka *= 2;
        } while (angka<=100);
    }
}
