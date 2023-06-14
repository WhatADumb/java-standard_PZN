package firmansyah.java.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("Fadhil");
        builder.append(" ");
        builder.append("Firmansyah");

        System.out.println(builder.toString());
    }
}
