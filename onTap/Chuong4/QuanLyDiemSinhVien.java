import java.util.*;

public class QuanLyDiemSinhVien {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int chon, n = 0;
        String[] ten = new String[100];
        double[] tb = new double[100];
        do{
            System.out.println("==== QUAN LY DIEM SINH VIEN ====");
            System.out.println("1. Nhap them hoc sinh");
            System.out.println("2. Xem danh sach va xep loai");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            chon = sc.nextInt();
            sc.nextLine();
            switch(chon){
                case 0:
                    System.out.println("Ket thuc chuong trinh");
                    break;
                case 1:
                    System.out.print("Ho ten: ");
                    ten[n] = sc.nextLine();

                    System.out.print("Diem toan: ");
                    double toan = sc.nextDouble();
                    System.out.print("Diem ly: ");
                    double ly = sc.nextDouble();
                    System.out.print("Diem hoa: ");
                    double hoa = sc.nextDouble();
                    System.out.print("Diem van: ");
                    double van = sc.nextDouble();
                    System.out.print("Diem anh: ");
                    double anh = sc.nextDouble();
                    System.out.println("Da them hoc sinh.");

                    tb[n] = (toan+ly+hoa+van+anh)/5;
                    n++;
                    break;
                case 2:
                    for(int i = 0; i < n; i++) {
                        String xepHang;
                        if(tb[i] >= 8.5){
                            xepHang = "Gioi";
                        }
                        else if(tb[i] >= 6.5) {
                            xepHang = "Kha";
                        }
                        else if(tb[i] >= 5) {
                            xepHang = "Trung binh";
                        }
                        else {
                            xepHang = "Yeu";
                        }
                        System.out.println((i+1) + ". " + ten[i] + "   TB = " + tb[i] + " --> " + xepHang);
                    }
                    break;
                default:
                    System.out.println("Khong hop le, nhap lai.");
                    break;
            }
        } while (chon != 0);
        sc.close();
    }
}
