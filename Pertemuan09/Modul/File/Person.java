import java.io.*;

public class Person implements Serializable {
    private String name;
    
    public Person(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
}