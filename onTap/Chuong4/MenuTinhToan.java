import java.util.*;

public class MenuTinhToan {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int option;
        double a,b;
        do{
            System.out.println("1. Cộng | 2. Trừ | 3. Nhân | 4. Chia | 5. Thoát");
            System.out.print("Chon phep tinh: ");
            option = sc.nextInt();

            if(option >= 1 && option <= 4){

                System.out.print("Nhap a: ");
                a = sc.nextDouble();
                System.out.print("Nhap b: ");
                b = sc.nextDouble();

                switch(option){
                    case 1:
                        System.out.println(a + " + " + b + " = " + (a+b));
                        break;
                    case 2:
                        System.out.println(a + " - " + b + " = " + (a-b));
                        break;
                    case 3:
                        System.out.println(a + " * " + b + " = " + (a*b));
                        break;
                    case 4:
                    if(b == 0){
                        System.out.println("Khong the chia het cho 0");
                        break;
                    }
                    else{
                        System.out.println(a + " / " + b + " = " + (a/b));
                        break;
                    }
                }
            }
            else if(option == 5){
                System.out.print("Da thoat chuong trinh");
            }
            else {
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }
        }
        while(option != 5);
        sc.close();
    }
}
