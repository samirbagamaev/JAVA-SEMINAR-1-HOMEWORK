//Вычислить n! (произведение чисел от 1 до n)

package WORK;

import java.util.Scanner;

/**
 * program1
 */
public class program2 {

    public static void main(String[] args) {
        
     int n = 0;
     int i = 1;
     int fact = 1;{

     Scanner scanner = new Scanner(System.in);
     System.out.println("ВВЕДИТЕ ЧИСЛО N: ");
     n = scanner.nextInt();
    }
     while(i<=n){
       fact = fact * i;
       i++;
    }
    System.out.println("ФАКТОРИАЛ ЧИСЛА " +n+ " РАВНЯЕТСЯ "  +fact);

    

 }
}
