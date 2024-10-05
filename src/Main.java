import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Оберіть функцію, 1(+), 2(-), 3(*), 4(/): ");
        int sw = scanner.nextInt();
        switch (sw) {
            case 1:
                System.out.println("Було обрано функцію +");
                SUM();
                break;
            case 2:
                System.out.println("Було обрано функцію -");
                RIZ();
                break;
            case 3:
                System.out.println("Було обрано функцію *");
                MNO();
                break;
            case 4:
                System.out.println("Було обрано функцію /");
                DIL();
                break;
            default:
                System.out.println("Error!!!");
                break;
        }
    }
    public  static void SUM(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число");
        float a = scanner.nextInt();
        System.out.println("Введіть друге число");
        float b = scanner.nextInt();
        float c = a+b;
        System.out.println("Сума = " + c);
    }
    public  static void RIZ(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число");
        float a = scanner.nextInt();
        System.out.println("Введіть друге число");
        float b = scanner.nextInt();
        float c = a-b;
        System.out.println("Різниця = " + c);
    }
    public  static void MNO(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число");
        float a = scanner.nextInt();
        System.out.println("Введіть друге число");
        float b = scanner.nextInt();
        float c = a*b;
        System.out.println("Добуток = " + c);
    }
    public  static void DIL(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число");
        float a = scanner.nextInt();
        System.out.println("Введіть друге число");
        float b = scanner.nextInt();
        float c = a/b;
        System.out.println("Частка = " + c);
    }
}
