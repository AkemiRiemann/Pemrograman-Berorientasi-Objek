import java.io.*;

public class SerializePerson {
    public static void main(String[] args){
        Person person = new Person("Panji");
        try {
            FileOutputStream f = new FileOutputStream("Person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Selesai Menulis Objek Person!");
            s.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}