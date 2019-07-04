package collection;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Example {
    public static void main(String[] args) {

        List<String> list = new ArrayList();

        list.add("waruna");
        list.add("sahan");
        list.add("oshan");

        System.out.println(list.indexOf("waruna"));
        System.out.println(list.indexOf("sahan"));
        System.out.println(list.indexOf("oshan"));
        list.remove("sahan");


        System.out.println(list.indexOf("waruna"));
        System.out.println(list.indexOf("sahan"));
        System.out.println(list.indexOf("oshan"));


        System.out.println("usng foreach");
        for (String a: list) {
            System.out.println(a);
        }
        System.out.println("usng stream API");
        list.stream().forEach(System.out::println);


        System.out.println("using iterator");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //remove from a arraylist
        //list.remove(1);
        System.out.println("sort from reverse order");

        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);




    }
}
