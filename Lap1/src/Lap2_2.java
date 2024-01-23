import java.util.Scanner;
public class Lap2_2 {

	public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập hệ số a: ");
        a = scanner.nextDouble();

        System.out.println("Nhập hệ số b: ");
        b = scanner.nextDouble();

        System.out.println("Nhập hệ số c: ");
        c = scanner.nextDouble();
        scanner.close();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiệm của phương trình là: x = " + x);
            }
        } else {
            delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x1);
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }

}
