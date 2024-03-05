import java.util.Scanner;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static double a, b, c, delta;
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 2: ax^2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị của a: ");
        a = scanner.nextDouble();
        System.out.println("Nhập giá trị của b: ");
        b = scanner.nextDouble();
        System.out.println("Nhập giá trị của c: ");
        c = scanner.nextDouble();

        if (a + b + c == 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt x1= 1 và x2= " + c/a);
        } else if (a - b + c == 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt x1= -1 và x2= " + -c/a);
        } else {
            delta = b*b - 4*a*c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép " + -b/2*a);
            } else {
                System.out.println("Phương trình có 2 nghiệm phân biệt x1= " + (-b + Math.sqrt(delta))/(2*a) + " và x2= " + (-b - Math.sqrt(delta))/(2*a));
            }
        }
    }
}