package Triangle.OthersHomeworks;

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


        printArray (array);
        System.out.println("----------------------");
        revArray(array);



    }

        public static void   printArray (int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i] + " array");
        }
    }


        public  static  void  revArray (int[] array){

        for(int r =array.length-1;r>=0; r--){
            System.out.println(array[r]+ " reverse array");


        }
        }





         }


