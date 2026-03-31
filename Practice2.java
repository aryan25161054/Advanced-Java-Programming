import java.util.Arrays;
import java.util.List;


public class Practice2 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(5,15,25,35,45,20,10);
        List<Integer> result = list.stream().map(x->x*x).limit(4).toList();
        System.out.println(result);
        List<Integer> list1 = Arrays.asList(45,10,5,60,20,30,15);
        List<Integer> result2  = list1.stream().filter(x->x % 2 != 0).sorted((x,y)->y-x).map(x->x*x).limit(1).toList();
        System.out.println(result2); 


    }
}
