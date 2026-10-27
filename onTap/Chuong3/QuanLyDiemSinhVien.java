import java.util.Scanner;

public class QuanLyDiemSinhVien {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        int tuoi = sc.nextInt();
        double toan = sc.nextDouble();
        double ly = sc.nextDouble();
        double hoa = sc.nextDouble();
        double tb = (toan+ly+hoa)/3;
        String xepHang;
        String dieuKien;

        if(tb >= 8.0){
            xepHang = "Gioi";
        }
        else if(tb >= 6.5) {
            xepHang = "Kha";
        }
        else if(tb >= 5.0) {
            xepHang = "Trung binh";
        }
        else {
            xepHang = "yeu";
        }

        if(tb >= 5 && toan >= 3 && ly >= 3 && hoa >= 3) {
            dieuKien = "Du dieu kien";
        }
        else {
            dieuKien = "Khong du dieu kien";
        }

        System.out.println("==== KET QUA HOC TAP ====");
        System.out.println("Ho ten: " + ten + " (" + tuoi + " tuoi" + ")");
        System.out.printf("Diem TB: %.2f%n", tb);
        System.out.println("Xep loai: " + xepHang);
        System.out.print("Len lop: " + dieuKien);
        sc.close();
    }
}
