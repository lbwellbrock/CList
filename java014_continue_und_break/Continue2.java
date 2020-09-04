public class Continue2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i > 5) {
                System.out.println("Ueberspringe Durchlauf " + i);
                break;
            }
            System.out.println(i);
        }
    }
}
