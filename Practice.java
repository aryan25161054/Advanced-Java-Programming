import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Practice {
    public static void main(String[] args) {


        ArrayList<Employee1> empList = new ArrayList<>(Arrays.asList(
                new Employee1(101, "Amit", 50000, 25, "IT"),
                new Employee1(102, "Neha", 60000, 28, "HR"),
                new Employee1(103, "Ravi", 45000, 24, "IT"),
                new Employee1(104, "Karan", 70000, 30, "Finance"),
                new Employee1(105, "Pooja", 55000, 27, "HR"),
                new Employee1(106, "Rohit", 80000, 32, "IT"),
                new Employee1(107, "Simran", 65000, 29, "Finance"),
                new Employee1(108, "Amit", 50000, 25, "IT")
        ));
        Optional<Employee1> result =   empList.stream().min((a, b)->(int)a.getSalary()-(int)b.getSalary());
              System.out.println(result);
    }
}
class Employee1 {
    int id;
    String name;
    double salary;
    int age;
    String department;

    public Employee1(int id, String name, double salary, int age, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
}
