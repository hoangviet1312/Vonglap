public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        for (int number = 2; number < 100; number++) {
            int count = 1;
            for (int i = number - 1; i > 1; i--) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(number + " la so nguyen to!");
            }
        }
    }
}
