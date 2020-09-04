public class HelloWorld {

    public static void main(String[] args) {
        String[] strings = {"Hello World"}; //gebe HelloWolrd aus
        StringBuilder builder = new StringBuilder();
        for(String s : strings) {
            builder.append(s + System.getProperty("line.separator"));
        }
        System.out.println(builder.toString());
    }
}
