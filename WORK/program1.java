//Вычислить n-ое треугольного число (сумма чисел от 1 до n)

package WORK;

import java.util.Scanner;

/**
 * program1
 */
public class program1 {

    public static void main(String[] args) {
        
    
     int n = 0;
     int i = 0;
     int sum = 0;{

     Scanner scanner = new Scanner(System.in);
     System.out.println("ВВЕДИТЕ ЧИСЛО N: ");
     n = scanner.nextInt();
    }
     
     for (i = 1; i <= n;i++){
       sum = sum + i;
     }
     System.out.println("ОТВЕТ: " +sum);

    

 }
}