import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        double a = input.nextDouble(); // khai báo biến
        System.out.print("Nhập số b: ");
        double b = input.nextDouble();
        System.out.print("Nhập phép toán: ");
        String operator = input.next();
        System.out.println("Máy tính: " + calculator(a, b, operator));
        System.out.println("Số lớn hơn: " + biggerNumer(a, b));
        oneToNumber(a);
    }

    public static double calculator(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }

    public static double biggerNumer(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void oneToNumber(double a) {
      int i = 0;
      while (a > i){ // vòng lặp while trong java
          System.out.print(i + " ");
          i++;
      }
    }
}