import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select a function, 1(+), 2(-), 3(*), 4(/): ");
        int sw = scanner.nextInt();
        switch (sw) {
            case 1:
                System.out.println("A function has been selected +");
                sum();
                break;
            case 2:
                System.out.println("A function has been selected -");
                dif();
                break;
            case 3:
                System.out.println("A function has been selected *");
                pro();
                break;
            case 4:
                System.out.println("A function has been selected /");
                fra();
                break;
            default:
                System.out.println("Error!!!");
                break;
        }
    }
    public  static void sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        float a = scanner.nextInt();
        System.out.println("Enter the second number");
        float b = scanner.nextInt();
        float c = a+b;
        System.out.println("Sum = " + c);
    }
    public  static void dif(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        float a = scanner.nextInt();
        System.out.println("Enter the second number");
        float b = scanner.nextInt();
        float c = a-b;
        System.out.println("Difference = " + c);
    }
    public  static void pro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        float a = scanner.nextInt();
        System.out.println("Enter the second number");
        float b = scanner.nextInt();
        float c = a*b;
        System.out.println("Product = " + c);
    }
    public  static void fra(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        float a = scanner.nextInt();
        System.out.println("Enter the second number");
        float b = scanner.nextInt();
        float c = a/b;
        System.out.println("Fraction = " + c);
    }
}
