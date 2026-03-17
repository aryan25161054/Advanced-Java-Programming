package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterAPI {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(10);
        list.add(20);
       list.add(30);
       list.addAll(List.of(40,50,60,70,80));
       System.out.println(list);
       Stream listStream = list.stream();
       list.stream().forEach((element)-> System.out.print(element+" "));
        System.out.println(  );
        list.stream().forEach(System.out::println);
        list.stream().filter(n->n>60).forEach(System.out::println);
       ArrayList<String> list1 = new ArrayList<>();
       list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.addAll(List.of("e","f","g","h","i"));
        list1.stream().forEach((element)->System.out.print(element+" "));
       System.out.println();
      list1.stream().forEach(System.out::println);
       System.out.println("Count = "+ list.stream().filter((item)->item>60).count());
        List<Integer> data =  Arrays.asList(23,53,52,62,85,90,76);
       System.out.println(data);
       ArrayList<Integer> list2= new ArrayList<>();
        list2.add(20);
        list2.add(45);
        list2.addAll(data);
        System.out.println(list2);
          list.stream().filter( (n)->n>45).forEach((n)->System.out.print(n+" "));
        List<Integer> g60 =  list.stream().filter( (n)->n>60 && n<90).toList();
        System.out.println();
        System.out.println(g60);





    }
}
