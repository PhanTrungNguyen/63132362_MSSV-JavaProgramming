import java.util.Scanner;
public class Lap1_3 {

	public static void main(String[] args) {
        // Sử dụng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập độ dài cạnh của khối lập phương
        System.out.print("Nhập độ dài cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();

        // Tính thể tích của khối lập phương
        double theTich = Math.pow(canh, 3);

        // Xuất kết quả ra màn hình
        System.out.println("Thể tích của khối lập phương là: " + theTich);

        // Đóng Scanner để tránh rò rỉ bộ nhớ
        scanner.close();
    }

}
