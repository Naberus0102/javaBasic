import java.util.*;

public class thueTNCN {
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        double thue = 0;
        double rate = 0;

        long luong = sc.nextLong();
        String a = sc.nextLine();

        String sv = sc.nextLine();
//---------------------------------//
        if(sv.equals("Y") || sv.equals("y")) {//
            if(luong < 5000000){
                rate = 0;
                thue = 0;
            }
            else if(luong < 10000000) {
                rate = 0.05;
                thue = luong*rate;
            }
            else if(luong < 20000000) {
                rate = 0.15/2;
                thue = luong*rate;
            }
            else {
                rate = 0.1;
                thue = (long)luong*rate;
            }
            long tien = (long) (luong - thue);
            System.out.println("Thue ap dung: " + rate*100*2 + "%");
            System.out.println("Tien thue: " + thue + "VND " + "(Da giam 50%)");
            System.out.print("Thu nhap sau thue: " + tien );
        }
        else if (sv.equals("N") || sv.equals("n")) {
            if(luong < 5000000){
                rate = 0;
                thue = 0;
            }
            else if(luong < 10000000) {
                rate = 0.1;
                thue = luong*rate;
            }
            else if(luong < 20000000) {
                rate = 0.15;
                thue = luong*rate;
            }
            else {
                rate = 0.2;
                thue = luong*rate;
            }
            long tien = (long) (luong - thue);//ép kiểu
            System.out.println("Thue ap dung: " + rate*100 + "%");
            System.out.println("Tien thue: " + (long) thue + " VND ");//ép kiểu
            System.out.print("Thu nhap sau thue: " + tien );
        }
        else{
            System.out.print("Error");
        }
    }

}
