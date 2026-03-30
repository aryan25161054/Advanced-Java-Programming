public class Inheritance {
    public static void main(String[] args) {
// Counter c1 = new Counter();
// Counter c2 = new Counter();
// Counter c3 = new Counter();
    Test t1  = new Test();


    }
}
class Stud {

}

class Counter {
    static int count = 0;
     int id ;
     Counter(){
         count++;
         id= id + count;// Every time id becomes zero than it gets count
         System.out.println("Object "+id+" created total "+count);
     }
}
class Test {

    Test(){
         this(10);
        System.out.println("Default Costumer");
    }
    Test(int x ){
        this(x,20);
        System.out.println("value of x  : " + x);
    }
    Test(int x , int y){
        int value = x + y;
        System.out.println(" x  = "+x+ " y = "+y);
    }

}
