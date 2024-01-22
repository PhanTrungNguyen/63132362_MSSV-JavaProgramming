import java.util.Scanner;
public class Lap1_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài hình chữ nhật: ");
		double dai = scanner.nextDouble();
		System.out.print("Nhập chiều rộng hình chữ nhật: ");
		double rong = scanner.nextDouble();
		double chuVi = (dai + rong) * 2;
		double dienTich = dai * rong;
		double canhNhoNhat = Math.min(dai, rong);
		System.out.println("Chu vi hình chữ nhật là: " + chuVi);
		System.out.println("Diện tích hình chữ nhật là: " + dienTich);
		System.out.println("Cạnh nhỏ nhất của hình chữ nhật là: " + canhNhoNhat);
		scanner.close();
	}

}
