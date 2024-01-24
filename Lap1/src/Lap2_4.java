import java.util.Scanner;
public class Lap2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            menu();  // Hiển thị menu
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc ứng dụng. Tạm biệt!");
                    break;
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 4);
    }

    public static void menu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+---------------------------------------------------+");
    }

    public static void giaiPTB1() {
        // Mã giải phương trình bậc nhất
        System.out.println("Đây là chức năng giải phương trình bậc nhất.");
    }

    public static void giaiPTB2() {
        // Mã giải phương trình bậc 2
        System.out.println("Đây là chức năng giải phương trình bậc 2.");
    }

    public static void tinhTienDien() {
        // Mã tính tiền điện
        System.out.println("Đây là chức năng tính tiền điện.");
    }
}
