/* Пусть дан произвольный список целых чисел, удалить из него чётные числа */
package HW_Java_3;

import java.util.ArrayList;
import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        int size = 10;
        int max = 100;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random random = new Random();
        
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(max);
            numbers.add(randomNumber);
        }
        
        System.out.println("Our list: " + numbers);
        
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--; 
            }
        }
        
        System.out.println("List after deleting odd numbers: " + numbers);
    }
}
