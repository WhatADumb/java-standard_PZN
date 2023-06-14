package firmansyah.java.classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try{
            Properties properties = new Properties();
            FileInputStream fileInput = new FileInputStream("sample.properties");
            properties.load(fileInput);

            String username = properties.getProperty("username.app");
            String port = properties.getProperty("port.data");
            String password = properties.getProperty("password");

            System.out.println(username);
            System.out.println(port);
            System.out.println(password);

        }catch(Throwable e){
            System.out.println("Error " + e.getMessage());
        }

        try{
            Properties properties = new Properties();
            FileOutputStream fileOut = new FileOutputStream("java.properties");
            properties.put("hobbies", "coding");
            properties.put("name.first", "Fadhil");
            properties.put("name.last", "Firmansyah");

            properties.store(fileOut, "");
        }catch(Exception e){

        }
    }
}
