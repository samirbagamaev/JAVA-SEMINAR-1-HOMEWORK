//Реализовать простой калькулятор (введите первое число, введите второе число,
//введите требуемую операцию, ответ)

package WORK;

import java.util.Scanner;

/**
 * program4
 */
public class program4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
     while(true) {

        System.out.println("ВЫБЕРИТЕ ДЕЙСТВИЕ: ");
        System.out.println("1.СЛОЖЕНИЕ)");
        System.out.println("2.ВЫЧИТАНИЕ");
        System.out.println("3.УМНОЖЕНИЕ");
        System.out.println("4.ДЕЛЕНИЯ");
        System.out.println("5.ВЫХОД ИЗ ПРОГРАММЫ");
        int person = scanner.nextInt();
        int result;
        if (person == 5 ){
            break;
        } else if (person == 2){
            System.out.println("ВВЕДИТЕ ПЕРВОЕ ЧИСЛО: ");
            int a = scanner.nextInt();
            System.out.println("ВВЕДИТЕ ВТОРОЕ ЧИСЛО: ");
            int b = scanner.nextInt();
            result = a - b;
            System.out.println("ОТВЕТ: " + result);
            
        } else if (person == 1){
            System.out.println("ВВЕДИТЕ ПЕРВОЕ ЧИСЛО: ");
            int a = scanner.nextInt();
            System.out.println("ВВЕДИТЕ ВТОРОЕ ЧИСЛО: ");
            int b = scanner.nextInt();
            result = a + b;
            System.out.println("ОТВЕТ: " + result);
            
        } else if (person == 3){
            System.out.println("ВВЕДИТЕ ПЕРВОЕ ЧИСЛО: ");
            int a = scanner.nextInt();
            System.out.println("ВВЕДИТЕ ВТОРОЕ ЧИСЛО: ");
            int b = scanner.nextInt();
            result = a * b;
            System.out.println("ОТВЕТ: " + result);
            
        } else if (person == 4){
            System.out.println("ВВЕДИТЕ ПЕРВОЕ ЧИСЛО: ");
            int a = scanner.nextInt();
            System.out.println("ВВЕДИТЕ ВТОРОЕ ЧИСЛО: ");
            int b = scanner.nextInt();
            if (b == 0){
                System.out.println("НА НОЛЬ ДЕЛИТЬ НЕЛЬЗЯ");
            }
            result = a / b;
            System.out.println("ОТВЕТ: " + result);
            
        } else {
            System.out.println("ОШИБКА");
        }
    }
    System.out.println("ПРОГРАММА ЗАВЕРШЕНА");
    }

}

