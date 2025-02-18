package Minggu2;
import java.util.Scanner;
public class Struk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama;
        double total = 0;
        double barang;
        
        System.out.println("------------------------------------------");
        System.out.println("        Kharisma Agung Plaza (KAP)  ");
        System.out.println("        Promo Belanja Berhadiah     ");
        System.out.println("    Khusus Pembelian 5 Barang Pertama   ");
        System.out.println("     Dengan harga minimum Rp 100000");
         System.out.println("------------------------------------------");
         
        System.out.print("Masukan Nama Pembeli : ");
        nama = scan.nextLine();
        for (int i = 0; i <= 5; i++) {
            System.out.print("Masukan harga barang ke-"+i+" = Rp.");
            barang = scan.nextDouble();
            total += barang;
        }
        
        System.out.println("Total harga pembelian atas nama "+nama+" adalah Rp. "+total);
        if (total>=100000) {
            System.out.println("Selamat....");
            System.out.println("Anda mendapat hadiah 1 mug cantik!");
        }else{
            System.out.println("Maaf... total harga anda tidak memenuhi");
        }
         System.out.println("------------------------------------------");
         System.out.println("                Terima Kasih        ");
         System.out.println("Anda sudah belanja di Kharisma Agung Plaza");
    }
}
