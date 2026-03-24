import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedEx {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(23,12,1, 45,23,76,36,93);
        List<Integer> sortedList = list.stream().sorted((a,b)->b-a).toList();//descending order
        System.out.println(sortedList);
        List<Integer> reverse = list.stream().sorted(Comparator.reverseOrder()).toList();
        // if comparable --> interface = compareTo
        // if comparator--> comparec
        List<Integer> list1 = Arrays.asList(12,5,33,9,21,1);
        List<Integer> ascending = list1.stream().sorted((a,b)->a-b).toList();
        System.out.println(ascending);
        List<Integer> list2 = Arrays.asList(45,11,78,2,90,34);
        List<Integer> descending = list2.stream().sorted((a,b)->b-a).toList();
        System.out.println(descending);
        List<Integer> list3  = Arrays.asList(18,42,7,91,33,25,60);
        List<Integer> topThree = list3.stream().sorted((a,b)->b-a).limit(3).toList();
        System.out.println(topThree);
        List<Integer> list4 = Arrays.asList(14,9,20,7,6,11,32,3);
        List<Integer> even = list4.stream().filter(b->b%2==0).sorted((a,b)->a-b).toList();
        System.out.println(even);
        List<Integer> list5 = Arrays.asList(27,4,10,11,35,2);
        List<Integer> result = list5.stream().sorted((a,b)->a-b).toList();
        System.out.println(result);
        List<Integer> list6  = Arrays.asList(10,5,10,7,5,3,8,3);
        List<Integer> duplicate = list6.stream().distinct().sorted((a,b)->a-b).toList();
        System.out.println(duplicate);
        List<Integer> list7 = Arrays.asList(23,12,1,45,23,76,26,91);
        Integer second = list7.stream().sorted(Comparator.reverseOrder()).toList().get(1);
        System.out.println(second);
        List<Integer> list8 = Arrays.asList(8,26,13,41,10,32,5);
         List<Integer> greater  = list8.stream().filter(b->b>20).sorted((a,b)->a-b).toList();
         System.out.println(greater);
         List<Integer> list9 = Arrays.asList(17,63,28,81,4,50);
         List<Integer> desc = list9.stream().sorted(Comparator.reverseOrder()).toList();
         System.out.println(desc);
         List<String> names = Arrays.asList("Ravi","Ankit","Zove","Meena","Kunal");
         List<String> ascNames = names.stream().sorted().toList();
         System.out.println(ascNames);
         List<String> descNames = names.stream().sorted((a,b)->b.compareTo(a)).toList();
        System.out.println(descNames);
        List<Employees> e1 = new ArrayList<>();
        e1.add(new Employees(1,"Rahul",20000,"IT"));
        e1.add(new Employees(2,"Vijay",40000,"IT"));
        e1.add(new Employees(3,"Ram",25000,"CS"));
        e1.add(new Employees(4,"Laxman",30000,"CS"));
        e1.add(new Employees(5,"Krishna",35000,"IT"));

        List<Employees> sorted = e1.stream().sorted((e3,e2)->e3.salary-e2.salary).toList();
        System.out.println(sorted);



    }
}
class Employees {
    int id;
    String name;
    int salary;
    String dept;
    Employees(int id, String name,int salary,  String dept){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    public String toString(){
        return name+" "+"has salary "+salary+" with id = "+ id+ " works in "+dept+"\n";
    }
}
