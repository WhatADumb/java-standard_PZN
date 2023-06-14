package firmansyah.java.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Fadhil Firmansyah";

        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.startsWith("Fadhil"));
        System.out.println(name.endsWith("Firmansyah"));
        String[] names = name.split(" ");
        for(String val : names){
            System.out.println(val);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());

        System.out.println(name.charAt(0));

        char[] nameChar = name.toCharArray();
        for(var i : nameChar){
            System.out.println(i);
        }
    }
}
