package firmansyah.java.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[-", "-]");
        
        joiner.add("Fadhil");
        joiner.add("Firmansyah");

        System.out.println(joiner.toString());
    }
}
