import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class StreamMinMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,5,40,15));

        Optional<Integer> result = list.stream().min((a,b)->a-b);
        System.out.println(result);
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,5,40,15));
        Optional<Integer> result1 = list1.stream().max((a,b)->a-b);
        System.out.println(result1);
        //second smallest
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(12,5,20,8,30,5,8));
        


    }
}

