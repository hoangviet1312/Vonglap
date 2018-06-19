import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        int n = 2;
        while (count < number) {
            int dem = 1;
            for (int i = n - 1; i > 1; i--) {
                if (n % i == 0) {
                    dem++;
                }
            }
            if (dem == 1) {
                System.out.println(n + " la so nguyen to!");
                count++;
            }
            n++;
        }
    }
}
