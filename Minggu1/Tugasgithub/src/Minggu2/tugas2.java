package Minggu2;
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukan warna lampu = ");
        lampu = scan.nextLine();
        
        
        switch (lampu){
            case "merah" :
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning" :
                System.out.println("Lampu kuning, hati - hati!");
                break;
            case "hijau"  :
                System.out.println("Lampu hijau, jalan!");
                break;
                default :
                System.out.println("Warna lampu salah!!!");
        }
        
    }
   
}
