import java.util.Scanner;
public class Lap2_3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện sử dụng trong tháng: ");
        double soDienSuDung = scanner.nextDouble();
        double tienDien = tinhTienDien(soDienSuDung);
        System.out.println("Số tiền điện cần thanh toán là: " + tienDien + " VND");
    }
	public static double tinhTienDien(double soDien) {
        double tien;
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }
        return tien;
    }
}
