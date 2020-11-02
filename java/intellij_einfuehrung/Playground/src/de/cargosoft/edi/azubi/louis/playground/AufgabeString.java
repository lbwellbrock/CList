package de.cargosoft.edi.azubi.louis.playground;
public class AufgabeString{
public static void main(String[] args) {
        String x = new String("Hallo");
        String y = new String("Das ist ein Test");

        int len1 = x.length();
        int len2 = y.length();
    System.out.println(len1 + " | " + len2);
    String yUpper = new String(y.toUpperCase());
    String xLower = y.toLowerCase();
    System.out.println(yUpper + " | " + xLower);
    String replaceString = y.replaceAll("i", "x" );
    System.out.println(replaceString);
    System.out.println(y);
    String test1 = new String("   Das ist ein Test     ");
    System.out.println(test1);
    String test2 = new String("   Das ist ein Test     ");
    System.out.println("["+test2+"]");

    String test3 = new String("hall0");
    String replaceString2 = test3.replaceAll("0", "o" );
    System.out.println(replaceString2);

    String test4 = new String("Das ist ein fweibterer Test");
    boolean containTest = test4.contains("abcdef");
    System.out.println(containTest);

    String test5 = new String("Das ist ein weiterer Test");
    String[] parts = test5.split(" ", 2);
    System.out.println(parts.length);
    for (int i = 0; i < parts.length; i++) {
        System.out.println(parts [i]);
    }

        }
        }
