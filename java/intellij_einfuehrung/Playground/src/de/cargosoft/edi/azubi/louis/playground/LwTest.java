package de.cargosoft.edi.azubi.louis.playground;

public class LwTest {

    public static void main(String[] args) {

        int[] i = new int[]{0, 8, 2, 0, 2 , 0, 0, 0,};

        int[] cleanedArray = clean(i);
        printArray(cleanedArray);
}
    public static int[] clean(int[] input) {

        int NumberOfZeros = 0;

        for (int positionen = 0; positionen < input.length; positionen++) {
            if (input[positionen] != 0) {
                NumberOfZeros++;
            }
            System.out.println("Anzahl von 0en in diesem Array : " + NumberOfZeros);
        }
        return input;
    }


    public static void printArray(int[] array) { //print array von arraytest.java
        System.out.println("Länge des Arrays: " + array.length);
        for (int i = 0; i < array.length; i++) {
            String x = String.valueOf(i);
            while (x.length() <= 10) {
                x += " ";
            }
            System.out.println(x + ": " + array[i]);

        }
    }

}
