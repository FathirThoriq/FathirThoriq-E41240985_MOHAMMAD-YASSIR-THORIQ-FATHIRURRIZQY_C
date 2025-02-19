package Minggu3;
import java.util.Scanner;
import java.util.Random;
public class Tugasarray2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int baris,kolom;
        System.out.print("Masukan baris = ");
        baris = scan.nextInt();
        System.out.print("Masukan kolom = ");
        kolom = scan.nextInt();
        
        int [][] deret = new int [baris] [kolom];
        for (int i = 0; i <baris; i++) {
            for (int j = 0; j < kolom; j++) {
                deret[i][j]=random.nextInt(100);
                System.out.print(deret[i][j]+" ");
            }System.out.println("");
        }
                
    }
}
