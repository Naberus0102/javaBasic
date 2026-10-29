import java.util.*;

public class QuanLyThongTinSVvaDiemThi {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int chon,them;
        int n = 0;
        int MAX = 100;

        String[] ma = new String[MAX];
        String[] ten = new String[MAX];
        double[] diem = new double[MAX];

        do {
            System.out.println("1. Them sinh vien");
            System.out.println("2. Loc SV diem > 8 hoac < 5");
            System.out.println("3. Tim SV diem cao nhat");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon  = sc.nextInt();
            sc.nextLine();

            switch(chon){
                case 0:
                    System.out.print("Da thoat chuong trinh.");
                    break;
                case 1:
                    System.out.println("So sinh vien can them: ");
                    them = sc.nextInt();
                    sc.nextLine();

                    for(int i = n; i < n + them; i++) {
                        System.out.println("-- Sinh vien thu " + (i+1));
                        System.out.print("Ma so: ");
                        ma[i] = sc.nextLine();
                        System.out.print("Ho ten: ");
                        ten[i] = sc.nextLine();
                        System.out.print("Diem: ");
                        diem[i] = sc.nextDouble();
                        sc.nextLine();
                    }
                    n = n + them;
                    break;
                case 2:
                    for(int i = 0; i < n; i++) {
                        if(diem[i] > 8) {
                            System.out.println(ma[i] + " - " + ten[i] + " - " + diem[i]);
                        }
                        else if (diem[i] < 5) {
                            System.out.println(ma[i] + " - " + ten[i] + " - " + diem[i]);
                        }
                    }
                    break;
                case 3:
                    int VTmax = 0;
                    for(int i = 0; i < n; i++) {
                        if(diem[i] > diem[VTmax] ){
                            VTmax = i;
                        }
                    }
                    System.out.println("Diem cao nhat: " + ma[VTmax] + " - " + ten[VTmax] + " - " + diem[VTmax]);
                    break;
                default:
                    System.out.println("Khong hop le");
                    break;
            }

        } while(chon != 0);
    }

}
