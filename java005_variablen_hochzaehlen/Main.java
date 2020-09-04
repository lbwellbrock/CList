public class Main {
    
   public static void main(String[] args) {
      int i = 10;
      

	int x = 10;
	System.out.println("x ist " + x);   // 10
	
	x++;
	System.out.println("x ist " + x);   // 11

	System.out.println("x ist (x++) " + x++);  // 11
	// in dieser Zeile ist x = 12
        int x = 10;
        System.out.println("x ist " + x);   // 10

        x++;
        System.out.println("x ist " + x);   // 11

        System.out.println("x ist (x++) " + x++);  // 11
        // in dieser Zeile ist x = 12

        System.out.println("x ist (++x)" + ++x);  // 13


        System.out.println("Am Ende ist x : " + x);
	
	System.out.println("x ist (++x)" + ++x);  // 13


	System.out.println("Am Ende ist x : " + x);


      System.out.println("Der Wert der Variable lautet   : " + ++i);
           System.out.println("Der Wert der Variable lautet   : " + ++i);
      System.out.println("Der Wert der Variable lautet   : " + ++i);
   }
}
