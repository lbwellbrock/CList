class GFG {


    void rightRotate(int arr[], int d, int n)
    {
        int temp[] = new int[n - d];

        for (int i = 0; i < n - d; i++)
            temp[i] = arr[i];

        for (int i = n - d; i < n; i++) {
            arr[i - d - 1] = arr[i];
        }

        for (int i = 0; i < n - d; i++) {
            arr[i + d] = temp[i];
        }
    }

    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args)
    {
        GFG rotate = new GFG();
        int arr[] = { 1, 2, 3, 4, 5 };
        rotate.rightRotate(arr, 2, arr.length);
        rotate.printArray(arr, arr.length);
    }
}












































//---------------------------------------------------
        //     int count, tip;

        //array größe
        //    Scanner scan = new Scanner(System.in);
        //   System.out.print("Enter number of elements you want in your array: ");
        //     count = scan.nextInt();

        //     int num[] = new int[count];
        //   System.out.println("Enter your array elements:");
        //  for (int i = 0; i < count; i++)
            //  {
            //     num[i] = scan.nextInt();
            // }
        //  scan.close();
        //  for (int i = 0; i < count; i++)
            //  {
            // for (int j = i + 1; j < count; j++) {
                // if (num[i] > num[j])
                    //{
                    //            tip = num[i];
                    //            num[i] = num[j];
                    //            num[j] = tip;
                    //        }
                //    }
            //  }
        //  System.out.print("Array Elements: ");
            //  for (int i = 0; i < count - 1; i++)
            //   {
          //  System.out.print(num[i] + ", ");
            //    }
        //    System.out.print(num[count - 1]);
        // }
//}
//---------------------------------------------------
//public class test {

   // public static void main(String[] args) {

       // char c;

        //for(c = 'A'; c <= 'Z'; ++c)
         //   System.out.print(c + " ");
  //  }
//}
//---------------------------------------------------
//public class test {

// public static void main(String[] args) {

//  char c;

//  for(c = 'a'; c <= 'z'; ++c)
//      System.out.print(c + " ");
//}
//}
//---------------------------------------------------
//public static void main(String[] args) {
//    double zahl1, zahl2, ergebnis;
//    Scanner scannerVariable = new Scanner(System.in);

//        System.out.println("Erste Zahl bitte.");
//       zahl1=scannerVariable.nextDouble();
//       System.out.println("Zweite Zahl bitte.");
//       zahl2=scannerVariable.nextDouble();
                        //       ergebnis=zahl1+zahl2;
//      System.out.println("Das Ergebnis ist: " + ergebnis);
//      System.out.println("Danke, für ihr Vertrauen");
//     }

//       }
//---------------------------------------------------
//import java.util.Arrays;
//public class test {
// static void main(String[] argv) throws Exception {
//int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
//System.out.println("Initial array...\n"+Arrays.toString(arr));
//System.arraycopy(arr, 1, arr,0, arr.length - 1);
//System.out.println("Array after shifting to the left...");
//System.out.println(Arrays.toString(arr));
//}
//}