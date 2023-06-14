package firmansyah.java.classes;

public class SystemApp {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv("NUMBER_OF_PROCESSORS"));
        System.out.println(System.getenv("TMP"));

        System.gc();

        System.exit(0);

        System.out.println("Hello There");
    }
}
