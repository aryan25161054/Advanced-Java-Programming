import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> studentInfo = new ArrayList<Student>();
        studentInfo.add(new Student("Student1","MCA",1));
        studentInfo.add(new Student("Student2","MCA",2));
        studentInfo.add(new Student("Student3","MCA",3));
        studentInfo.add(new Student("Student4","MCA",4));
       for(int i = 0; i<studentInfo.size(); i++){
           System.out.println(studentInfo.get(i));
       }


    }
}
class Student {
   private String name;
   private String course;
   private int id;
   public Student(String name, String course, int id){
       this.name = name;
       this.course = course;
       this.id = id;
   }
   @Override
  public String toString(){
       return name+" "+course+" "+id;
   }



}
