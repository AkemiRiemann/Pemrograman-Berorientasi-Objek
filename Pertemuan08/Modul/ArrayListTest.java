import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Praktikum");
        strings.add("Collection");
        strings.add("dan Generics");
        strings.remove("Praktikum");
        for (String s: strings){
            System.out.println(s);
        }
    }
}