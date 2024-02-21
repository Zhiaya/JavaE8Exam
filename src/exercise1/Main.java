package exercise1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int count =  0;

        while (true) {
            System.out.print("Input the number or exit with (-1) : ");
            int number = input.nextInt();
            if (number == -1) break;

            if (count == numbers.length) {
                int[] temp = new int[numbers.length *  2];
                System.arraycopy(numbers,  0, temp,  0, numbers.length);
                numbers = temp;
            }
            numbers[count] = number;
            count++;
        }

        System.out.println("Output the number :");
        for (int i =  0; i < count; i++) {
            System.out.println(numbers[i]);
        }
    }
}
