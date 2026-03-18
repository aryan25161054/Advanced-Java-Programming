package StreamAPI;

import java.util.ArrayList;

public class StreamA {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
            students.add(new Student("Aryan",75,1));
            students.add(new Student("Rahul",90,2));
            students.add(new Student("Ram",60,3));
            students.add( new Student("Laxman",78,4));
            students.add(new Student("Hanuman",88,5));
        System.out.println("\t\t Sname \t\t Smarks \t\t SrollNo");
        students.stream().filter(student -> student.getMarks()>60).forEach((student)->{
            String result= String.format("\t\t%s\t\t%d\t\t%d",student.getName(),student.getMarks(),student.getRollNo());
            System.out.println(result);
        });

    }
}
class Student {
   private int rollNo;
   private String name;
  private  int marks;
    Student(String name, int marks, int rollNo){
        this.name = name;
        this.marks = marks;
        this.rollNo= rollNo;
    }
    public String getName() {
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public int getRollNo(){
        return rollNo;
    }
    @Override
    public String toString(){
        return "Student = [rollNo = "+rollNo+", Name = "+name + ", marks = "+marks+"]";
    }

}