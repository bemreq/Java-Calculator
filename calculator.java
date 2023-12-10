import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter First And Second Number:");
        Scanner inp = new Scanner(System.in);
        int num1, num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        System.out.println("Choose Your Operation 1 (Addition), 2 (Subtraction), 3 (Multiplication), 4 (Division)");
        int choose = inp.nextInt();
        inp.close();
        System.out.println("The Answer Is:");
        switch (choose) {
            case 1:
                System.out.println(add(num1, num2));
                break;
            case 2:
                System.out.println(sub(num1, num2));
                break;
            case 3:
                System.out.println(mult(num1, num2));
                break;
            case 4:
                System.out.println(div(num1, num2));
                break;
            default:
                System.out.println("Illegal Operation");
        }
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mult(int x, int y) {
        return x * y;
    }

    public static int div(int x, int y) {
        return x / y;
    }
}
