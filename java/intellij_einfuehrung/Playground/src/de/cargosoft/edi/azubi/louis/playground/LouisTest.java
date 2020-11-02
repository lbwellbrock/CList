package de.cargosoft.edi.azubi.louis.playground;
import java.util.Arrays;
import java.util.Scanner;

public class LouisTest {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wie Viele Spieler möchtest du in deinem Array hinterlegen:");
        int player = s.nextInt();
        int [] myArray = new int[player];
        System.out.println("Spielernamen eingeben bitte:");
        for(int i=0; i<player; i++ ) {
            myArray[i] = s.nextInt();
            System.out.println("Dieser Spieler hat folgendes Rating:" + player);
        }

        System.out.println(Arrays.toString(myArray));
    }
}








//public class LouisTest {

//  public static void main(String[] args) {
//     int[] x = new int[100];
//
//     for (int a = 0; a < x.length; a++) {
//         x[a] = a + 100;
//     }
//     // shiftArray(x);
//     rotate(x);

//    int[] reversedX = reverse(x);

//   System.out.println("---------------------");
// printArray(reversedX);
////
//}

                //public static void printArray(int[] array) {
                //    System.out.println("Länge: " + array.length);
                //   for (int i = 0; i < array.length; i++) {
                //      String x = String.valueOf(i);
                //     while (x.length() <= 10) {
                //         x += " ";
                //    }
                //    System.out.println(x + ": " + array[i]);

                // }
// }

                //  public static int[] reverse(int[] input) {
                //     int[] output = new int[input.length];
//
                //    for (int i = 0; i < input.length; i++) {
                //        output[i] = input[input.length - 1 - i];
                //    }
                //    return output;
//  }
//
                // public static int[] rotate(int[] array, int h) {


                // }
//}

