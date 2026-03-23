import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReduceEx {
    public static void main(String[] args) {


        List<Integer> list1 = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88);
        int sum = list1.stream().reduce(0, (a, b) -> b % 2 == 0 ? a + b : a);

        System.out.println(sum);
        List<String> name = Arrays.asList("Java", "Stream", "API", "Reduce");
        String finalList = name.stream().reduce("", (a, b) -> a + "" + b);
        System.out.println(finalList);
        List<Integer> list2 = Arrays.asList(12, 45, 67, 23, 89, 34, 78);
        int max = list2.stream().reduce(0, (a, b) -> a > b ? a : b);
        int SecondMax = list2.stream().reduce(0, (a, b) -> a > b && a < max ? a : b);
        int smallest = list2.stream().reduce(0, (a, b) -> a < b ? a : b);
        int secondSmallest = list2.stream().reduce(0, (a, b) -> a < b && a > smallest ? a : b);
        System.out.println(secondSmallest);
        List<String> namesList = Arrays.asList("Java", "Programming", "Stream", "API", "Functional");
        //   int ll = namesList.stream().reduce(0,(a,b)->a.length()>b.length() ? a.length() : b.length()) ;
        List<Integer> list3 = Arrays.asList(12, 34, 56, 76);
        int sumOfDigits = list3.stream().reduce(0, (a, b) -> {
            int sum1 = 0;
            int temp = b;
            while (temp > 0) {
                int r = temp % 10;
                sum1 = sum1 + r;
                temp = temp / 10;
            }

            return a + sum1;


        });
        System.out.println(sumOfDigits);
        int value = 123456;
        System.out.println(String.valueOf(value).chars().map(c -> c - '0').reduce(0, (a, b) -> a + b));
        int n = 5;
        int fact = IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
        System.out.println(fact);




    }
}
