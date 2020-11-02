package de.cargosoft.edi.azubi.louis.playground;

public class Arraytest {
    public static void main(String[] args) {
//        int[] x = new int[4];
//        for (int a = 0; a < x.length; a++) {
//            x[a] = a + 1;
//        }
//
//        System.out.println("*********** START *************");
//        printArray(x);
//
//        int[] shiftedArray = x;
//
//        for (int i = 0; i < x.length; i++) {
//            System.out.println("*********** DURCHLAUF " + (i + 1) + " ************");
//            shiftedArray = shiftRight(shiftedArray);
////             shiftedArray = shiftLeft(shiftedArray);
//            //    boolean tempEquals = compareArrays(x, shiftedArray);
//            //     System.out.println("Während der Iteration sind die beiden Arrays identisch : " + tempEquals);
//            printArray(shiftedArray);
//        }


        int[] a = new int[3];
        int[] b = new int[3];

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 0;
        b[0] = 10;
        b[1] = 20;
        b[2] = 30;

        boolean x = compareCorrected(a, b);
        System.out.println("-------------");

        System.out.println(x);


        System.out.println("*********** ENDE *************");

        //   boolean eqauls = compareArrays(x, shiftedArray);
        //   System.out.println("Am Ende sind beide Arrays identisch : " + eqauls);

        //   printArray(shiftedArray);

    }


    public static boolean compareCorrected(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i] == false) {
                return false;
            }
        }

        return true;
    }

    private static boolean compareArrays(int[] array1, int[] array2) {
        boolean H = false;
        for (int i = 0; i < array2.length; i++) {

            for (int a = 0; a < array1.length; a++) {

                if (array2[i] == array1[a]) {
                    H = true;
                    System.out.println("true");
                } else {
                    H = false;
                    System.out.println("False");
                    break;
                }
            }
        }
        return H;
    }


    public static void printArray(int[] array) {
        System.out.println("Länge: " + array.length);
        for (int i = 0; i < array.length; i++) {
            String x = String.valueOf(i);
            while (x.length() <= 10) {
                x += " ";
            }
            System.out.println(x + ": " + array[i]);

        }
    }

    public static int[] reverse(int[] input) {
        int[] output = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            output[i] = input[input.length - 1 - i];
        }
        return output;
    }

    public static int[] shiftLeft(int[] input) {
        int[] output = new int[input.length];

        for (int i = 0; i < input.length - 1; i++) {
            output[i] = input[i + 1];
        }

        output[output.length - 1] = input[0];

        return output;


    }

    public static int[] shiftRight(int[] input) {
        int[] output = new int[input.length];

        for (int i = 0; i < input.length - 1; i++) {
            output[i + 1] = input[i];
        }

        output[0] = input[input.length - 1];

        return output;
    }
}


