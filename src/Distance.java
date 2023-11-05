import java.util.Scanner;


public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số x1: ");
        double x1 = input.nextDouble(); // khai báo biến
        System.out.print("Nhập số y1: ");
        double y1 = input.nextDouble();

        System.out.print("Nhập số x2: ");
        double x2 = input.nextDouble(); // khai báo biến
        System.out.print("Nhập số y2: ");
        double y2 = input.nextDouble();

        System.out.println("Khoảng cách giữa 2 điểm trong không gian: " +
                Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));

        System.out.println("Khoảng cách giữa 2 điểm trong không gian: " +
                Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
    }
}
