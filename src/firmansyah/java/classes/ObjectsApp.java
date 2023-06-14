package firmansyah.java.classes;

import java.util.Objects;

public class ObjectsApp {
    
    public static class Data{
        private String data;

        public Data(String data){
            this.data = data;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static void main(String[] args) {
        execute(null);
    }

    public static void execute(Data data){
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
    }
}
