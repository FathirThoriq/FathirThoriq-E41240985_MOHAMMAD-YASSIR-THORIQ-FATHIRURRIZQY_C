package Minggu3;
import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukan batas awal = ");
        int Awal = scan.nextInt();
        System.out.print("Masukan batas akhir = ");
        int Akhir = scan.nextInt();
        
        System.out.println("Bilangan awal genap mulai dari "+Awal+" sampai dengan "+Akhir+" adalah ");
        for (int i = Awal; i <= Akhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
