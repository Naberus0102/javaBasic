import java.util.*;

public class KiemTraNgayHopLe {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int ngay = sc.nextInt();
        int thang = sc.nextInt();
        int nam = sc.nextInt();
        int namNhuan;

        if(nam % 400 == 0 || (nam % 100 != 0 && nam % 4 == 0)){
            namNhuan = 1;
        }
        else{
            namNhuan = 0;
        }

        if ((ngay >= 1 && ngay <=31) && (thang >= 1 && thang <=12)){
            if(thang == 2){
                if((ngay == 28 && namNhuan == 0) || (ngay == 29 && namNhuan == 1)){
                    System.out.print("Hop le");
                }
                else {
                    System.out.print("Khong hop le");
                }
            }
            else if(thang == 4 || thang == 6 || thang == 9 || thang == 11){
                if(ngay <= 30){
                    System.out.print("Hop le");
                }
                else{
                    System.out.print("Khong hop le");
                }
            }
            else {
                if(ngay <= 31){
                    System.out.print("Hop le");
                }
                else{
                    System.out.print("Khong hop le");
                }
            }
        }
        else{
            System.out.print("Sai dinh dang");
        }
    }
}
