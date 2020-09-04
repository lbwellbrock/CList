public class Main5 {   
public static void main(String[] args) {

        int a = 10;
        int b = 20;
	int c = 30;
        int z = 0;
	 
        z = add(a, b);
         
        int ergebnis = add(z, c);

        System.out.println(ergebnis);
    }

    public static int add(int a, int b) {
        int x = a + b;

        return x;
    }
   }
