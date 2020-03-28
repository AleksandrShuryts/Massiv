/*Дана последовательность целых чисел a1, …, an (N<20), 
 * число K. Вычислить сумму отклонений элементов последовательности от числа K (ai - K).
 */
package array;

import java.util.Random;
import java.util.Scanner;

public class Mas_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();	
		int[] array = new int[19];
			int K;
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				array[i] = random.nextInt(20);
				System.out.print(array[i] + " ");
			}
			System.out.println();
			System.out.print("Введите значение отклонения: ");
			K = scanner.nextInt();
			System.out.println("Массив отклонений");
			for (int i = 0; i < array.length; i++) {
				sum += array[i] - K;
				array[i] = array[i] - K;
				System.out.print(array[i] + " ");
				
			}
			System.out.println();
			System.out.println("Сумма отклонений равна: " + sum);
				
			scanner.close();

	}

}
