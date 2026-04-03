public class Lambda {
    public static void main(String[] args) {
  CheckVote c1 = new CheckVote();
    CanVote c  = c1::checkVote;
        System.out.println(c.canVote(22));


    }
}

@FunctionalInterface
interface CanVote{
    boolean canVote(int age);
}
class CheckVote {
    public  boolean checkVote (int n ){
        if(n<18){
            return false;
        }
        return true;
    }
}
