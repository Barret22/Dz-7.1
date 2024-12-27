package app;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Створюємо масив цілих чисел з 20
        // елементами
        int[] array = new int[20];

        // Заповнюємо масив випадковими
        // числами від -100 до 100.
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        // Виводимо масив
        System.out.print("Елементи масиву: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Знаходимо суму всіх від'ємних чисел
        // в масиві.
        int sumNegative = 0;
        for (int num : array) {
            if (num < 0) {
                sumNegative += num;
            }
        }
        System.out.println("Сума від'ємних чисел: " + sumNegative);

        // Знаходимо кількість парних і
        // непарних чисел в масиві.
        int evenCount = 0, oddCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);

        // Знаходимо найбільший та найменший
        // елементи масиву та їхні індекси.
        int max = array[0], min = array[0];
        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");

        // Знаходимо середнє арифметичне чисел
        // після першого від'ємного числа.
        int firstNegativeIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex == -1) {
            System.out.println("У масиві немає від'ємних чисел.");
        } else {
            int sumAfterNegative = 0;
            int countAfterNegative = 0;

            for (int i = firstNegativeIndex + 1; i < array.length; i++) {
                sumAfterNegative += array[i];
                countAfterNegative++;
            }

            double average = (countAfterNegative == 0) ? 0 : (double) sumAfterNegative / countAfterNegative;
            System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f%n", average);
        }
    }
}
