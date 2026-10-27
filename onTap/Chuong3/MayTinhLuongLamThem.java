import java.util.*;

public class MayTinhLuongLamThem {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double gioLamThem = sc.nextDouble();
        int luongCoBan = sc.nextInt();
        double hsl = sc.nextDouble();
        int tuoi  =sc.nextInt();
        double luong;
        if(gioLamThem > 40) {
            if(tuoi >=18) {
                luong = (luongCoBan*hsl*40) + (gioLamThem - 40)*1.5*hsl*luongCoBan;
            }
            else {
                luong = luongCoBan*hsl*20;
            }
        }
        else {
            if(tuoi >=18) {
                luong = (luongCoBan*hsl*gioLamThem);
            }
            else {
                if(gioLamThem >= 20) {
                    luong = luongCoBan*hsl*20;
                }
                else{
                    luong = luongCoBan*hsl*gioLamThem;
                }
            }
        }
        System.out.print(luong);
    }

}
