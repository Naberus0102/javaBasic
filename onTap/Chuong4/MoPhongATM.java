import java.util.*;

public class MoPhongATM {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int thanhCong = 0;
        int thatBai = 0;
        long soDu = 10000000;
        int chon,tienRut;
        do{
            System.out.println("So du hien tai: " + soDu);
            System.out.println("1. Rút tiền   0. Thoát");
            System.out.print("Chon: ");
            chon = sc.nextInt();

            if(chon == 1){
                System.out.print("Nhap so tien can rut: ");
                tienRut = sc.nextLong();
                if(tienRut % 10000 != 0){
                    thatBai++;
                    System.out.println("So tien phai la boi so cua 10.000 VND");
                    continue;
                }
                else if(tienRut > soDu){
                    thatBai++;
                    System.out.println("That bai: So du khong du");
                    continue;
                }
                else if(tienRut == soDu){
                    thanhCong++;
                    System.out.println("Rut thanh cong " + tienRut + " VND");
                    System.out.println("Tai khoan da het tien.");
                    break;
                    }
                else {
                    soDu = soDu - tienRut;
                    thanhCong++;
                    System.out.println("Rut thanh cong " + tienRut);
                }
            }
            else if(chon == 0){
                System.out.println("Thoat");
            }
            else {
                System.out.println("Khong hop le");
                thatBai++;
            }

        }
        while (chon != 0);
        System.out.println("===== LICH SU GIAO DICH =====");
        System.out.println("Thanh cong: " + thanhCong);
        System.out.println("That bai: " + thatBai);
        System.out.println("So du cuoi: " + soDu);
    }
}
