package Minggu2;
import java.util.Scanner;
public class Cafe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama;
        int menu;
        
        
        System.out.println("---------------");
        System.out.println("  CAFE CERIA");
        System.out.println(" ANEKA MINUMAN");
        System.out.println("---------------");
        
        System.out.println(" SPECIAL MENU : ");
        System.out.println(" 1. Soft Drink");
        System.out.println(" 2. Mix Juice");
        System.out.println(" 3. Nescafe");
        System.out.println(" 4. Soda Milk");
        System.out.println(" 5. Tea");
        System.out.println("---------------");
        
        System.out.print("Masukan nama pembeli : ");
        nama = scan.nextLine();
        System.out.print("\nMasukan pilihan anda : ");
        menu = scan.nextInt();
        switch (menu){
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft Drinks");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix Juice");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda Milk");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Anda belum memilih menu!!");
        }
        System.out.println("Pesanan anda akan segera kami antar");
        System.out.println("Terima kasih "+nama+" telah berkunjung di Cafe kami");
    }
    
}
