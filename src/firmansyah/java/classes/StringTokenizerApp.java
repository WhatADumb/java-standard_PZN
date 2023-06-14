package firmansyah.java.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String value = "Fadhil Firmansyah";

        StringTokenizer token = new StringTokenizer(value, " ");

        while(token.hasMoreTokens()){
            String line = token.nextToken();
            System.out.println(line);
        }
    }
}
