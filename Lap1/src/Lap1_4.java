import java.util.Scanner;
public class Lap1_4 {

	public static void main(String[] args) {
        double a, b, c, delta;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        a = scanner.nextDouble();
        System.out.println("Nhập hệ số b: ");
        b = scanner.nextDouble();
        System.out.println("Nhập hệ số c: ");
        c = scanner.nextDouble();
        scanner.close();
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else {
            double canDelta = Math.sqrt(delta);

            System.out.println("Căn delta: " + canDelta);
        }
    }

}
