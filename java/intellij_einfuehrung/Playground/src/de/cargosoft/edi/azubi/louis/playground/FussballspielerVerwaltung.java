package de.cargosoft.edi.azubi.louis.playground;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;


public class FussballspielerVerwaltung {

    private static String[] players = new String[0];
    private static int[] rating = new int[0];
    private static String[] teams = new String[0];
    private static int[] ratingTeams = new int[0];
    private static String[] competitions = new String[0];
    private static int[] ratingcompetitions = new int[0];


    public static void main(String args[]) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        System.out.println("");
        System.out.println("Was wollen sie machen, wählen sie eine der folgenden möglichkeiten, 1, 2, 3, 4, 5, 6 oder 0 aus");
        System.out.println("");
        System.out.println("1) Spieler Anzeigen");
        System.out.println("2) Spieler Hinzufügen");
        System.out.println("3) Team Hinzufügen");
        System.out.println("4) Team Anzeigen");
        System.out.println("5) Wettbewerbe Hinzufügen");
        System.out.println("6) Wettbewerbe Anzeigen");
        System.out.println("");
        System.out.println("0) Ende");
        System.out.println("");
        System.out.print("Auswahl treffen bitte: ");
        Scanner s = new Scanner(System.in);
        String eingabe = s.next();

        if (eingabe.equals("1")) {
            displayPlayers();
        } else if (eingabe.equals("2")) {
            displayNewPlayerMenu();
        } else if (eingabe.equals("3")) {
            displayNewTeams();
        } else if (eingabe.equals("4")) {
            displayTeams();
             } else if (eingabe.equals("5")) {
            displayNewcompetitions();
             } else if (eingabe.equals("6")) {
            displaycompetitions();
        } else if (eingabe.equals("0")) {
            System.exit(0);
        } else {
            System.out.println("*******************");
            System.out.println("* Falsche Eingabe *");
            System.out.println("*******************");
            System.out.println("");
            displayMainMenu();
        }
    }

    private static void displayPlayers() {
        System.out.println("Sie haben Spieler anzeigen ausgewählt");
        System.out.println("");
        for (int counter = 0; counter < rating.length; counter++) {
            System.out.println(counter + 1 + ")     " + players[counter] + " (Rating " + rating[counter] + ")");
        }

        System.out.println("");
        System.out.println("main Zurueck zum Hauptmenu");
        System.out.println("");
        System.out.print("Auswahl: ");
        Scanner s = new Scanner(System.in);
        String spieler = s.next();

        if (spieler.equals("main")) { //Hauptmenü
            displayMainMenu();
        } else if (spieler.equals("1")) {
            System.exit(0);
        }
    }

    public static void displayNewPlayerMenu() {
        System.out.println("Bitte Spielernamen eingeben (exit = Zurueck ins Hauptmenu)");
        System.out.print("Name/exit: ");

        Scanner s = new Scanner(System.in);
        String spielername = s.next();


        if (spielername.equals("exit")) {
            // zurück in das Hauptmenu
            displayMainMenu();
        } else {
            System.out.print("Bitte das Rating (0-100) eingeben: ");
            Scanner scanner2 = new Scanner(System.in);
            String newRating = scanner2.next();

            System.out.println("Spieler " + spielername + " mit Rating : " + rating + " wird angelegt ...");

            extendArrays();
            players[players.length - 1] = spielername;
            rating[rating.length - 1] = Integer.valueOf(newRating);
            displayMainMenu();
        }
    }

    public static void extendArrays() {
        String[] newPlayers = new String[players.length + 1];
        for (int counter = 0; counter < players.length; counter++) {
            newPlayers[counter] = players[counter];
        }

        players = newPlayers;

        int[] newRating = new int[rating.length + 1];
        for (int counter = 0; counter < rating.length; counter++) {
            newRating[counter] = rating[counter];
        }
        rating = newRating;
    }

    public static void displayNewTeams() {
        System.out.println("Bitte Teamnamen eingeben (exit = Zurueck ins Hauptmenu)");
        System.out.print("Teamname/exit: ");

        Scanner s = new Scanner(System.in);
        String newteamname = s.next();


        if (newteamname.equals("exit")) {
            displayMainMenu();
        } else {
            System.out.print("Bitte das Rating (0-100) eingeben: ");
            Scanner scanner2 = new Scanner(System.in);
            String newRating = scanner2.next();


            System.out.println("Team " + teams + " mit Rating : " + ratingTeams + " wird angelegt ...");

            extendArrays2();
            teams[teams.length - 1] = newteamname;
            ratingTeams[ratingTeams.length - 1] = Integer.valueOf(newRating);
            displayMainMenu();
        }
    }

    public static void extendArrays2() {
        String[] newTeams = new String[teams.length + 1];
        for (int counter = 0; counter < teams.length; counter++) {
            newTeams[counter] = teams[counter];
        }

        teams = newTeams;

        int[] newRatingTeams = new int[ratingTeams.length + 1];
        for (int counter = 0; counter < ratingTeams.length; counter++) {
            newRatingTeams[counter] = ratingTeams[counter];
        }
        ratingTeams = newRatingTeams;
    }

    private static void displayTeams() {
        System.out.println("Sie haben Teams anzeigen ausgewählt");
        System.out.println("");
        for (int counter = 0; counter < ratingTeams.length; counter++) {
            System.out.println(counter + 1 + ")     " + teams[counter] + " (Rating " + ratingTeams[counter] + ")");
        }

        System.out.println("");
        System.out.println("main Zurueck zum Hauptmenu");
        System.out.println("");
        System.out.print("Auswahl: ");
        Scanner s = new Scanner(System.in);
        String showTeams = s.next();

        if (showTeams.equals("main")) {
            displayMainMenu();
        } else if (showTeams.equals("1")) {
            System.exit(0);
        }
    }

    private static void displayNewcompetitions() {
        System.out.println("Sie haben neue Wettbewerbe ausgewählt");
        System.out.println("noch nicht implementiert!");
        displayMainMenu();
    }

    private static void displaycompetitions() {
        System.out.println("Sie haben neue Wettbewerbe ausgewählt");
        System.out.println("noch nicht implementiert!");
        displayMainMenu();
    }
}
