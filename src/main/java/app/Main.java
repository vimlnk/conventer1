package app;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Програма для конвертації миль в кілометри, кілометрів в милі");

        System.out.println("Перетворюємо милі в кілометри ");
        System.out.println("Введіть милі : ");
        Scanner scanner = new Scanner(System.in);
        double mi = scanner.nextInt();
        double km;
        km = mi*1.60934;
        System.out.println(mi + " миль "+ "= "+ km +" кілометрів. ");



        }
}