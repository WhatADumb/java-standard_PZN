package firmansyah.java.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer valInt = 1000;
        Float valFloat = valInt.floatValue();
        Double valDouble = valInt.doubleValue();
        Byte valByte = valInt.byteValue();

        String number = "1000";
        Integer number1 = Integer.valueOf(number);
        System.out.println(number1);
    }
}
