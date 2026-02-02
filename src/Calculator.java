public class Calculator {
    public static void main(String[] args){
        Sum sum = new Sum(5,4);
        Multiply m = new Multiply();
        m.multiple(4,4);

    }

}
class Sum {
    int a;
    int b;
    Sum(int a , int b) {
        this.a = a;
        this.b= b;
        System.out.println(a+b);
    }

}
class Multiply {
    int c;
    int d;
    public void multiple(int a, int b){
        c = a;
        d = b;
        System.out.println(c*d);
    }

}



