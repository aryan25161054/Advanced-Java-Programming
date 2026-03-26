import java.util.Arrays;
import java.util.List;

public class Mse1 {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("java","mca","hello","late");
//        list.forEach(s -> System.out.println(s.toUpperCase()));
        List<String> namesList = Arrays.asList("ram","laxman","hanuman","dashrath");
        namesList.forEach(s->System.out.println("hello "+s));
        List<String> names = Arrays.asList("arrehman","anderson","sunny");
      names.forEach(s->{
          if(s.charAt(0)=='A' || s.charAt(0)=='a'){
              System.out.println(s);
          }
      });
      names.forEach(s-> { if(s.length()>5)
      {System.out.println(s);}});
      List<Integer> numbers = Arrays.asList(1,3,5,5);
      numbers.forEach(System.out::println);

    }

}
