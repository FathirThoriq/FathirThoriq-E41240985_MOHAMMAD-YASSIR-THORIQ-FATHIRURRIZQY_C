package Pewarisan;
public class Demo {
    public static void main(String[] args) {
        A superOB = new A();
        B subOB = new B();
        
        System.out.println("SuperClass");
        superOB.x = 10;
        superOB.y = 20;
        superOB.TampilkanNilaiXY();
        
        System.out.println("SubClass");
        subOB.x = 5;
        subOB.y = 2;
        subOB.TampilkanNilaiXY();
        
        subOB.z = 50;
        subOB.TampilkanJumlah();
    }
    
}
