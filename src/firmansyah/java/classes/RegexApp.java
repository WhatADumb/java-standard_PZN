package firmansyah.java.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String original = "Fadhil Firmansyah belajar Java Standard Class dulu";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[J][a-zA-Z]*");
        Matcher match = pattern.matcher(original);

        while (match.find()) {
            String result = match.group();
            System.out.println(result);
        }
    }
}
