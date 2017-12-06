package Triangle.OthersHomeworks;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {


    public static void main(String[] args) {

        int[] array;

        array = new int[10];

        final Random r = new Random();

        array[0] = r.nextInt(10);
        array[1] = r.nextInt(10);
        array[2] = r.nextInt(10);
        array[3] = r.nextInt(10);
        array[4] = r.nextInt(10);
        array[5] = r.nextInt(50);
        array[6] = r.nextInt(50);
        array[7] = r.nextInt(50);
        array[8] = r.nextInt(50);
        array[9] = r.nextInt(50);

        Arrays.sort(array);
        printArray(array);
        System.out.println("----------------------");
        int first = 0;
        int last = array.length;

        binarySearch(array, first, last, 8);


    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i] + " array");
        }
    }

    public static void binarySearch(int[] array, int first, int last, int searchedElement) {

        int position;

        position = (first + last) / 2;

        while ((array[position] != searchedElement) && (first <= last)) {

            if (array[position] > searchedElement) {

                last -= position;

            } else {

                first += position;
            }

            position = (first + last) / 2;

        }

        if (first <= last) {
            System.out.println(searchedElement + " является " + ++position + " элементом в массиве");

        } else {
            System.out.println("Элемент не найден в массиве.");
        }


    }
}
