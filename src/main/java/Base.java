/**
 * @author Drozhzhin Dmitriy
 */

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        // Ввод первого числа
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число и нажмите Enter: ");
        // Ввод второго числа
        double firstNumber = scan.nextDouble();
        System.out.print("Введите второе число и нажмите Enter: ");
        double secondNumber = scan.nextDouble();
        double sum = firstNumber + secondNumber;
        System.out.printf("Сумма: %.4f", sum);
        scan.close();
    }
}
