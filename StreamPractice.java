package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10,15,20,20,25,25,30,11,17,16);
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(data);
        list.stream().filter(n->n % 2 == 0).forEach(n->System.out.print(n+" "));
        list.stream().distinct().filter(n->n>15).forEach(System.out::println);

        /* Q2  */    List<String> namesList = Arrays.asList("Amir","Ravi","Anil","Vikas","Ashok","Rahul");
        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(namesList);
        nameList.stream().filter(n->{
            if(n.charAt(0)=='A'){
                return true;}
            return false;
        }).forEach(n->System.out.println(n));
        /* Q3 */   List<Integer> list1 = Arrays.asList(10,60,45,90,30,24,50,76);
        ArrayList<Integer> g50 = new ArrayList<>();
        g50.addAll(list1);
        g50.stream().filter(n-> n>=50 && n<=60).forEach(n->System.out.println(n));
        /*Q4 */
        List<String> list2 = Arrays.asList("Java","Python","C","React","CF","Next js","Node.js");
        ArrayList<String> g5 = new ArrayList<>();
        g5.addAll(list2);
        g5.stream().filter(n->n.length()>5).forEach(System.out::println);
        /* Q5 */
        List<String> list3 = Arrays.asList("Java",null,"Spring",null,"React");
        ArrayList<String> notNull = new ArrayList<>();
        notNull.addAll(list3);
        List<String> printAllNotNull =   notNull.stream().filter(n->n != null).toList();
        System.out.println(printAllNotNull);


    }
}
