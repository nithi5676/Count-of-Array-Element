package countOfArray;

import java.util.Scanner;
import java.util.Arrays;

class CountOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Enter elements into array");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        CountOfArray countOfArray = new CountOfArray();
        countOfArray.Count(array, size);

    }

    public void Count(int array[], int size) {
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println(max);
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < max) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}