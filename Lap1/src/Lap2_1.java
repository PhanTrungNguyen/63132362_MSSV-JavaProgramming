import java.util.Scanner;
public class Lap2_1 {

	public static void main(String[] args) {
        double a, b, x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        a = scanner.nextDouble();
        System.out.println("Nhập hệ số b: ");
        b = scanner.nextDouble();
        scanner.close();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            x = -b / a;
            System.out.println("Nghiệm của phương trình là: x = " + x);
        }
    }

}
