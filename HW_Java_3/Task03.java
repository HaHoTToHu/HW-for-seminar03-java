/* Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее из этого списка. */
package HW_Java_3;

import java.util.*;

public class Task03 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,6,7,46,3213,325,67,86,999,6,4);
        
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        int sum = 0;
        
        System.out.println("Minimal value: " + min);
        System.out.println("Maximal value: " + max);

        if (numbers.size() > 0){
            for (int i = 0; i < numbers.size(); i++) {
                sum += numbers.get(i);
            }
            double average = (double) sum / numbers.size();
            System.out.println("Average: " + average);
        }
        
    }  
}