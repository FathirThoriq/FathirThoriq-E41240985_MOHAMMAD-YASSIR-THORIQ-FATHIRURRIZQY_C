public class Minggu2Siswa {
    public static void main(String[] args) {
        String fName = "Lisa";
        String lName = "Palombo";
        String stuId = "123456789";
        boolean stuStatus;
        stuStatus = true;
        
        System.out.println("Student Name = " +fName+lName );
        System.out.println("Student ID = " +stuId);
        System.out.println("Student Status = " +(stuStatus ?"active" : "Non-Active"));
    }
}
