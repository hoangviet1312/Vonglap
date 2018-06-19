import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println("Menu: ");
        System.out.println("1 . Hinh chu nhat.");
        System.out.println("2 . Hinh tam giac vuong.");
        System.out.println("3 . Tam giac can.");
        System.out.println("4 . Exit.");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 5; j > i; j--) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*   ");
                    }
                    for (int f = 1; f > i; f++) {
                        System.out.print("*   ");
                    }
                    System.out.println();
                    }

        }
    }
}
