/**
 * Dieses ist eine Dokumentation fuer die Klasse Main
 *
 * @param int a Der erste Wert der addiert werden soll
 * @param int b Der zweite Wert der addiert werden sol
 * @param int c Der dritte Wert der addiert werden soll
  */

public class Main { // david stinkt
public static void main(String[] args) {
 
        int a = 200;
        int b = 440;
        int c = 210;
        int z = 0;
 
        z = add(a, b);
 
        int ergebnis = add(z, c);
 
        System.out.println(ergebnis);
    }
/**
 * Dieses ist eine Dokumentation fuer die add Methode
 *
 * @param a Der erste Wert der addiert werden soll
 * @param b Der zweite Wert der addiert werden soll
  * @return Das Ergebnis der Addition
 *
 */
 
    public static int add(int a, int b) {
        int x = a + b;
 
        return x;
    }
   }
