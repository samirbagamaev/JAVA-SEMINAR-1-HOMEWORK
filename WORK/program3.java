//Вывести все простые числа от 1 до 1000 (числа, которые делятся 
//только на 1 и на себя без остатка)

package WORK;

public class program3 {
    public static void main(String[] args) {
         for (int i = 2; i <= 1000; i++){ 
            boolean num = true;
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    num = false;;
                    break;
                }
            }
            if(num){
                System.out.println(i);
            }

         }
    }
}
