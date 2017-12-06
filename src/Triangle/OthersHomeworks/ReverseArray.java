package Triangle.OthersHomeworks;

import java.util.Arrays;
import java.util.Random;

public class ReverseArray {

    public static void main(String[] args) {

        int array[];

        array = new int[10];

        final Random r = new Random();

        array[0] = r.nextInt(10);
        array[1] = r.nextInt(10);
        array[2] = r.nextInt(10);
        array[3] = r.nextInt(10);
        array[4] = r.nextInt(10);
        array[5] = r.nextInt(10);
        array[6] = r.nextInt(10);
        array[7] = r.nextInt(10);
        array[8] = r.nextInt(10);
        array[9] = r.nextInt(10);


        printArray(array);
        System.out.println("----------------------");


        //           revArray(array);
        System.out.println(Arrays.toString(revArray(array)));


    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i] + " array");
        }
    }

    public static int[] revArray(int[] array) {
        int[] arrayReverse = new int[array.length];

        for (int i = 0, r = arrayReverse.length - 1; i < array.length; i++, r--) {

            arrayReverse[r] = array[i];
        }

        return arrayReverse;

    }


}
