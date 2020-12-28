/**
 * @author Drozhzhin Dmitriy
 */

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Ввод первого числа
        System.out.print("Введите первое число и нажмите Enter: ");
        double firstNumber = scan.nextDouble();
        // Ввод второго числа
        System.out.print("Введите второе число и нажмите Enter: ");
        double secondNumber = scan.nextDouble();
        // Суммирование двух чисел и вывод в консоль
        double sum = firstNumber + secondNumber;
        System.out.printf("Сумма: %.4f", sum);
        scan.close();
    }
}
