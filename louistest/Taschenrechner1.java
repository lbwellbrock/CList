import java.util.Scanner;




 /**
    * dient als Taschenrechner im Logistikbereich
    * @author  LouisB.Wellbrock
    * @version 1.1
     */

public class Taschenrechner1 { //Klassen Name, in diesem Fall Taschenrechner1

	public static void main(String[] args) { //Main Methode
		double zahl1, zahl2, ergebnis; //Zahl1 und Zahl2 Ausgabe 
		Scanner v1 = new Scanner(System.in); //Variable 1 und 2

		System.out.println("Erste Zahl bitte."); //Erste Zahl, Eingabe des Benutzers
		zahl1=v1.nextDouble();
		System.out.println("Zweite Zahl bitte."); //Zweite Zahl, Eingabe des Benutzers
		zahl2=v1.nextDouble();
		ergebnis=zahl1+zahl2; //Zusammenrechnung
		System.out.println("Das Ergebnis ist: " + ergebnis); //Ausgabe des Ergebnisses
	}

}
